package com.samelody.samples.compose.state

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.samelody.samples.compose.R
import com.samelody.samples.compose.base.ActivityScaffold
import com.samelody.samples.compose.base.BaseActivity
import com.samelody.samples.compose.base.VExample

class StateActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ActivityScaffold(R.string.state) { ContentView() } }
    }
}

@Composable
private fun ContentView(viewModel: StateViewModel = viewModel()) {
    val name by viewModel.name.observeAsState("")
    Column(
        Modifier.padding(16.dp)
    ) {
        VExample("State and Jetpack Compose")
        StateInput(name) {
            viewModel.onNameChanged(it)
        }
    }
}

@Composable
private fun StateInput(name: String, onChanged: (String) -> Unit) {
    Column {
        Text(
            text = "Hello $name",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.h5
        )
        OutlinedTextField(
            value = name,
            onValueChange = onChanged,
            label = { Text("Name") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = false
)
fun PreviewStateInput() {
    StateInput("Belin Wu") {}
}