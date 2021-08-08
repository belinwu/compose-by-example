package com.samelody.samples.compose.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.reflect.KClass

val ExamplePadding = 12.dp

@Composable
fun VExample(section: String) {
    Example(section = section, hasHorizontalPadding = false)
}

@Composable
fun HExample(section: String) {
    Example(section = section, hasVerticalPadding = false)
}

@Composable
fun Example(
    section: String,
    hasHorizontalPadding: Boolean = true,
    hasVerticalPadding: Boolean = true
) {
    // Text is a predefined composable that does exactly what you'd expect it to - display text on
    // the screen. It allows you to customize its appearance using style, fontWeight, fontSize, etc.
    val horizontalPadding = if (hasHorizontalPadding) ExamplePadding else 0.dp
    val verticalPadding = if (hasVerticalPadding) ExamplePadding else 0.dp
    Text(
        "Example: $section",
        style = TextStyle(
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.W900,
            fontSize = 16.sp,
            color = Color.Black
        ),
        modifier = Modifier.padding(
            horizontal = horizontalPadding,
            vertical = verticalPadding
        ).background(Color(0xFFEEEEEE)).fillMaxWidth()
    )
}

@Composable
fun ExampleItem(
    text: String,
    cls: KClass<out Activity>,
) {
    val context = LocalContext.current
    TextButton(
        onClick = { context.startExample(cls) }
    ) {
        Text(text)
    }
}

private fun Context.startExample(cls: KClass<out Activity>) {
    Intent(this, cls.java).apply {
        startActivity(this)
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewExample() {
    Example("This is a example section ")
}

@Composable
@Preview(showBackground = true)
private fun PreviewVExample() {
    VExample("This is a example section without horizontal padding")
}

@Composable
@Preview(showBackground = true)
private fun PreviewHExample() {
    HExample("This is a example section without vertical padding")
}