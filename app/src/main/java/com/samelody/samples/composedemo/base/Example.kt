package com.samelody.samples.composedemo.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val ExamplePadding = 12.dp

@Composable
fun TextExample(title: String) {
    Example(title = title, startPadding = false)
}

@Composable
fun Example(title: String, startPadding: Boolean = true) {
    // Text is a predefined composable that does exactly what you'd expect it to - display text on
    // the screen. It allows you to customize its appearance using style, fontWeight, fontSize, etc.
    val start = if (startPadding) ExamplePadding else 0.dp
    Text(
        "Example: $title",
        style = TextStyle(
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.W900,
            fontSize = 14.sp,
            color = Color.Black
        ),
        modifier = Modifier.padding(
            start = start,
            end = ExamplePadding,
            top = ExamplePadding,
            bottom = ExamplePadding
        ).background(Color(0xFFEEEEEE)).fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun PreviewExample() {
    Example("This is a section")
}