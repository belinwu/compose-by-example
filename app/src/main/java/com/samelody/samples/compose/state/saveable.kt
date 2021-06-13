package com.samelody.samples.compose.state

import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.mapSaver
import androidx.compose.runtime.saveable.rememberSaveable
import kotlinx.parcelize.Parcelize

@Parcelize
data class City(
    val name: String,
    val country: String,
): Parcelable

@Composable
fun CityScreen1() {
    val selectedCity = rememberSaveable { mutableStateOf(City("Xiamen", "China")) }
}

val CityMapSaver = run {
    val nameKey = "name"
    val countryKey = "country"
    mapSaver(
        save = { mapOf(nameKey to it.name, countryKey to it.country) },
        restore = { City(it[nameKey] as String, it[countryKey] as String) }
    )
}

@Composable
fun CityScreen2() {
    val selectedCity = rememberSaveable(stateSaver = CityMapSaver) {
        mutableStateOf(City("Xiamen", "China"))
    }
}

val CityListSaver = listSaver<City, String>(
    save = { listOf(it.name, it.country) },
    restore = { City(it[0], it[1]) },
)

@Composable
fun CityScreen3() {

}