package com.samelody.samples.composedemo.layout

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.samelody.samples.composedemo.base.BaseActivity
import com.samelody.samples.composedemo.base.Section
import com.samelody.samples.composedemo.theme.AppTheme

class StandardLayoutActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { AppTheme { ContentView() } }
    }
}

@Composable
private fun ContentView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Section("Layout: Column")
        ColumnLayout()
        Section("Layout: Row")
        RowLayout()
        Section("Layout: Box")
        BoxLayout()
        Section("Custom Composable using Column, Row and Box")
        PreviewProfileCard()
    }
}

//@Preview
//@Composable
//private fun PreviewContentView() {
//    ContentView()
//}

@Composable
private fun ColumnLayout() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        ColumnBox(color = Color.Blue)
        ColumnBox(color = Color.Black)
        ColumnBox(color = Color.Green)
    }
}

@Composable
fun ColumnBox(height: Dp = 24.dp, color: Color = Color.Black) {
    Box(
        modifier = Modifier
            .height(height)
            .width(100.dp)
            .fillMaxWidth()
            .background(color)
    )
}

@Composable
fun RowBox(width: Dp = 24.dp, color: Color = Color.Black) {
    Box(
        modifier = Modifier
            .width(width)
            .height(100.dp)
            .fillMaxHeight()
            .background(color)
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewColumnLayout() {
    ColumnLayout()
}

@Composable
private fun RowLayout() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
//        horizontalArrangement = Arrangement.SpaceAround
    ) {
        RowBox(color = Color.Blue)
        RowBox(color = Color.Black)
        RowBox(color = Color.Green)
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewRowLayout() {
    RowLayout()
}

@Composable
private fun BoxLayout() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(color = Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(color = Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Green)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewBoxLayout() {
    BoxLayout()
}

@Composable
fun ProfileCard() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEEEEEE))
            .padding(6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(
                    Color.Black,
                    CircleShape
                )
        )
        Spacer(Modifier.size(10.dp, 48.dp))
        Column {
            MaxWidthBox(color = Color.Blue)
            MaxWidthBox(color = Color.Green)
        }
    }
}

@Composable
fun MaxWidthBox(height: Dp = 24.dp, color: Color = Color.Black) {
    Box(
        modifier = Modifier
            .height(height)
            .fillMaxWidth()
            .fillMaxWidth()
            .background(color)
    )
}

@Composable
@Preview(showBackground = true)
fun PreviewProfileCard() {
    ProfileCard()
}