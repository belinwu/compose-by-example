package com.samelody.samples.composedemo.text

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samelody.samples.composedemo.R
import com.samelody.samples.composedemo.base.*
import com.samelody.samples.composedemo.theme.AppTheme

class TextActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { AppTheme { ContentView() } }
    }
}

@Composable
private fun ContentView() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = ExamplePadding)
            .verticalScroll(rememberScrollState())
    ) {
        VExample("Displaying text")
        SimpleText()
        VExample("Displaying text from resource")
        StringResourceText()
        VExample("Changing the text color")
        BlueText()
        VExample("Changing the text size")
        BigText()
        VExample("Making the text italic")
        ItalicText()
        VExample("Making the text bold")
        BoldText()
        VExample("Text alignments")
        CenterText()
        VExample("Working with fonts")
        DifferentFonts()
        VExample("Working with custom fonts")
        CustomFonts()
        VExample("SpanStyle in a text")
        SpanStyleText()
        VExample("ParagraphStyle in a text")
        ParagraphStyleText()
        VExample("Maximum number of lines")
        LongText()
        VExample("Text overflow")
        OverflowText()
        VExample("Selecting text")
        SelectableText()
        VExample("Selecting text partially")
        PartiallySelectableText()
        VExample("Getting the position of a click on text")
        SimpleClickableText()
        VExample("Click with annotation")
        AnnotatedClickableText()
    }
}

@Composable
@Preview(showBackground = true)
fun SimpleText() {
    Text(
        "Hello Compose!",
        Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
fun StringResourceText() {
    Text(
        stringResource(R.string.hello_world),
        Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
fun BlueText() {
    Text(
        "Hello World",
        color = Color.Blue,
    )
}

@Composable
@Preview(showBackground = true)
fun BigText() {
    Text(
        "Hello world!",
        fontSize = 30.sp,
    )
}

@Composable
@Preview(showBackground = true)
fun ItalicText() {
    Text(
        "Hello world!",
        fontStyle = FontStyle.Italic,
    )
}

@Composable
@Preview(showBackground = true)
fun BoldText() {
    Text(
        "Hello world!",
        fontWeight = FontWeight.Bold,
    )
}

@Composable
@Preview(showBackground = true)
fun CenterText() {
    Text(
        "Hello world!",
        textAlign = TextAlign.Center,
        modifier = Modifier.width(150.dp)
    )
}

@Composable
@Preview(showBackground = true)
fun DifferentFonts() {
    Column {
        Text(
            "Hello world!",
            fontFamily = FontFamily.Serif,
        )
        Text(
            "Hello world!",
            fontFamily = FontFamily.Monospace,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CustomFonts() {
    val fontFamily = FontFamily(
        Font(R.font.firasans_light, FontWeight.Light),
        Font(R.font.firasans_regular, FontWeight.Normal),
        Font(R.font.firasans_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.firasans_medium, FontWeight.Medium),
        Font(R.font.firasans_bold, FontWeight.Bold),
    )
    Column {
        Text(
            "Hello world!",
            fontFamily = fontFamily,
            fontWeight = FontWeight.Light
        )
        Text(
            "Hello world!",
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal
        )
        Text(
            "Hello world!",
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Italic
        )
        Text(
            "Hello world!",
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium
        )
        Text(
            "Hello world!",
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SpanStyleText() {
    val text = buildAnnotatedString {
        withStyle(SpanStyle(color = Color.Blue)) {
            append("H")
        }
        append("ello ")
        withStyle(SpanStyle(color = Color.Red, fontWeight = FontWeight.Bold)) {
            append("W")
        }
        append("orld")
    }
    Text(text)
}

@Composable
@Preview(showBackground = true)
fun ParagraphStyleText() {
    val text = buildAnnotatedString {
        withStyle(ParagraphStyle(lineHeight = 30.sp)) {
            withStyle(SpanStyle(Color.Blue)) {
                append("Hello\n")
            }
            withStyle(SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                append("World\n")
            }
            append("Compose")
        }
    }
    Text(text)
}

@Composable
@Preview(showBackground = true)
fun LongText() {
    Text(
        "Hello".repeat(50),
        maxLines = 2,
        modifier = Modifier.background(Color.Yellow)
    )
}

@Composable
@Preview(showBackground = true)
fun OverflowText() {
    Text(
        "Hello Compose".repeat(50),
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.background(Color.Yellow)
    )
}

@Composable
@Preview(showBackground = true)
fun SelectableText() {
    SelectionContainer {
        Text("This text is selectable")
    }
}

@Composable
@Preview(showBackground = true)
fun PartiallySelectableText() {
    SelectionContainer {
        Column {
            Text("This text is selectable")
            Text("This one too")
            Text("This one as well")
            DisableSelection {
                Text("But not this one")
                Text("Neither this one")
            }
            Text("But again, you can select this one")
            Text("And this one too")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SimpleClickableText() {
    val context = LocalContext.current
    ClickableText(
        text = AnnotatedString("Click Me"),
        onClick = { offset ->
            shortToast(context, "${offset}th character is clicked")
        }
    )
}

@Composable
@Preview(showBackground = true)
fun AnnotatedClickableText() {
    val tag = "url"
    val text = buildAnnotatedString {
        append("Click ")
        pushStringAnnotation(tag, "https://developer.android.com")
        withStyle(SpanStyle(color = Color.Blue, fontWeight = FontWeight.Bold)) {
            append("here")
        }
        pop()
    }
    val context = LocalContext.current
    ClickableText(
        text,
        onClick = { offset ->
            text.getStringAnnotations(tag, offset, offset).firstOrNull()?.let { annotation ->
                shortToast(context, "offset=${offset}, ${annotation.item} is clicked.")
            }
        }
    )
}