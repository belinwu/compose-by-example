package com.samelody.samples.compose.list

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.samelody.samples.compose.base.BaseActivity
import com.samelody.samples.compose.theme.AppTheme

class LazyRowActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { AppTheme { ContentView() } }
    }
}

@Composable
private fun ContentView() {
    val modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
    LazyRow(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Text(text = "First item", modifier = modifier)
        }
        items(50) { index ->
            Text(text = "Item $index", modifier = modifier)
        }
        item {
            Text(text = "Last item", modifier = modifier)
        }
    }
}