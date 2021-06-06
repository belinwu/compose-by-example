package com.samelody.samples.composedemo.text

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samelody.samples.composedemo.R
import com.samelody.samples.composedemo.base.BaseActivity
import com.samelody.samples.composedemo.base.Section
import com.samelody.samples.composedemo.theme.AppTheme

class TextActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { AppTheme { ContentView() } }
    }
}

private val startPadding = 16.dp

@Composable
private fun ContentView() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Section("Displaying text")
        SimpleText()
        Section("Displaying text from resource")
        StringResourceText()
        Section("Changing the text color")
        BlueText()
    }
}

@Composable
@Preview(showBackground = true)
fun SimpleText() {
    Text(
        "Hello Compose!",
        Modifier.fillMaxWidth().padding(start = startPadding)
    )
}

@Composable
@Preview(showBackground = true)
fun StringResourceText() {
    Text(
        stringResource(R.string.hello_world),
        Modifier.fillMaxWidth().padding(start = startPadding)
    )
}

@Composable
@Preview(showBackground = true)
fun BlueText() {
    Text(
        "Hello World",
        color = Color.Blue,
        modifier = Modifier.padding(start = startPadding)
    )
}