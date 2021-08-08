package com.samelody.samples.compose.image

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.samelody.samples.compose.R
import com.samelody.samples.compose.R.string
import com.samelody.samples.compose.base.ActivityScaffold
import com.samelody.samples.compose.base.BaseActivity
import com.samelody.samples.compose.base.ExamplePadding
import com.samelody.samples.compose.base.VExample

@ExperimentalCoilApi
class ImageActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ActivityScaffold(string.image) { ContentView() } }
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
        VExample("Coil")
        CoilImage()
    }
}

private val ImageUrl = "https://bkimg.cdn.bcebos.com/pic/34fae6cd7b899e510fb3b76356edce33c895d143a738"

@ExperimentalCoilApi
@Composable
@Preview(showBackground = true)
private fun CoilImage() {
    Image(
        painter = rememberImagePainter(
            data = "https://bkimg.cdn.bcebos.com/pic/34fae6cd7b899e510fb3b76356edce33c895d143a738",
            onExecute = { _, _ -> true },
            builder = {
                placeholder(ColorDrawable(Color.LTGRAY))
                crossfade(true)
            }
        ),
        contentDescription = stringResource(R.string.image_content_desc),
        modifier = Modifier.size(150.dp, 150.dp)
    )
}