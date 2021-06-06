package com.samelody.samples.composedemo.base

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

@Composable
fun Section(title: String) {
    // Text is a predefined composable that does exactly what you'd expect it to - display text on
    // the screen. It allows you to customize its appearance using style, fontWeight, fontSize, etc.
    Text(
        title,
        style = TextStyle(
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.W900,
            fontSize = 14.sp,
            color = Color.Black
        ),
        modifier = Modifier.padding(16.dp).fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewSection() {
    Section("This is a section")
}