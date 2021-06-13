package com.samelody.samples.composedemo.layout

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.samelody.samples.composedemo.base.BaseActivity
import com.samelody.samples.composedemo.base.Example
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
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Example("Column")
        ColumnLayout()
        Example("Row")
        RowLayout()
        Example("Box")
        BoxLayout()
        Example("Column & Row & Box")
        ProfileCard()
        Example("Align: Column")
        AlignInColumn()
        Example("Align: Row")
        AlignInRow()
        Example("Modifier: padding")
        PaddingModifier()
        Example("Modifier: size")
        SizeModifier()
        Example("Modifier: requiredSize")
        RequiredSizeModifier()
        Example("Modifier: fillMaxSize")
        FillSizeModifier()
        Example("Modifier: matchParentSize")
        MatchParentSizeModifier()
        Example("Modifier: paddingFromBaseline")
        PaddingFromBaselineModifier()
        Example("Modifier: offset")
        OffsetModifier()
        Example("Modifier: weight: Column")
        ColumnWeightModifier()
        Example("Modifier: weight: Row")
        RowWeightModifier()
    }
}

@Composable
private fun ColumnLayout() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {},
        horizontalAlignment = Alignment.CenterHorizontally,
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
        modifier = Modifier
            .fillMaxWidth()
            .clickable {},
        horizontalArrangement = Arrangement.Center,
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
            .clickable {}
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
@Preview(showBackground = true)
fun ProfileCard() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEEEEEE))
            .clickable {}
            .padding(6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(Color.Black, CircleShape),
            contentAlignment = Alignment.BottomEnd
        ) {
            Box(
                modifier = Modifier
                    .size(16.dp)
                    .background(Color.Red, CircleShape)
            )
        }
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
@Preview
private fun AlignInColumn() {
    Column(
        Modifier
            .size(150.dp)
            .background(Color.Yellow),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            Modifier
                .size(50.dp)
                .background(Color.Red))
        Box(
            Modifier
                .size(50.dp)
                .background(Color.Blue))
    }
}

@Composable
@Preview
private fun AlignInRow() {
    Row(
        Modifier
            .size(150.dp)
            .background(Color.Yellow),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            Modifier
                .size(50.dp)
                .background(Color.Red))
        Box(
            Modifier
                .size(50.dp)
                .background(Color.Blue))
    }
}

@Composable
@Preview
private fun PaddingModifier() {
    Text(
        "Hello world!",
        modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .padding(20.dp)
    )
}


@Composable
@Preview
private fun SizeModifier() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Red)
    )
}

@Composable
@Preview
fun RequiredSizeModifier() {
    Box(
        Modifier
            .size(90.dp, 150.dp)
            .background(Color.Green)
    ) {
        Box(
            Modifier
                .requiredSize(100.dp, 100.dp)
                .background(Color.Red))
    }
}

@Composable
@Preview
fun FillSizeModifier() {
    Box(
        Modifier
            .background(Color.Green)
            .size(50.dp)
            .padding(10.dp)
    ) {
        Box(
            Modifier
                .background(Color.Blue)
                .fillMaxSize())
    }
}

@Composable
@Preview
fun MatchParentSizeModifier() {
    Box {
        Spacer(
            Modifier
                .matchParentSize()
                .background(Color.Green))
       Text("Hello Jetpack Compose!")
    }
}

@Composable
@Preview
fun PaddingFromBaselineModifier() {
    Box(Modifier.background(Color.Yellow)) {
        Text("Hello Compose", modifier = Modifier.paddingFromBaseline(top = 32.dp))
    }
}

@Composable
@Preview
fun OffsetModifier() {
    Box(
        Modifier
            .background(Color.Yellow)
            .height(70.dp)
            .width(200.dp)
            .fillMaxWidth()
    ) {
        Text(
            "Layout offset modifier",
            Modifier.offset(x = 15.dp, y = 20.dp)
        )
        Text(
            "Layout offset modifier",
            Modifier.offset(x = (-10).dp, y = (-10).dp)
        )
    }
}

@Composable
@Preview
fun RowWeightModifier() {
    Row(
        Modifier.width(100.dp)
    ) {
        Box(Modifier.weight(2f).height(50.dp).background(Color.Blue))
        Box(Modifier.weight(1f).height(50.dp).background(Color.Yellow))
    }
}

@Composable
@Preview
fun ColumnWeightModifier() {
    Column(
        Modifier.height(100.dp).width(50.dp)
    ) {
        Box(Modifier.weight(2f).fillMaxWidth().background(Color.Blue))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Yellow))
    }
}