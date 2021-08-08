package com.samelody.samples.compose.main

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.google.accompanist.flowlayout.FlowRow
import com.samelody.samples.compose.R
import com.samelody.samples.compose.base.BaseActivity
import com.samelody.samples.compose.base.Example
import com.samelody.samples.compose.base.ExampleItem
import com.samelody.samples.compose.base.ExamplePadding
import com.samelody.samples.compose.base.VExample
import com.samelody.samples.compose.image.ImageActivity
import com.samelody.samples.compose.layout.ConstraintLayoutActivity
import com.samelody.samples.compose.layout.StandardLayoutActivity
import com.samelody.samples.compose.list.LazyColumnActivity
import com.samelody.samples.compose.list.LazyRowActivity
import com.samelody.samples.compose.state.StateActivity
import com.samelody.samples.compose.text.TextActivity
import com.samelody.samples.compose.text.TextFieldActivity
import com.samelody.samples.compose.theme.AppTheme

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = stringResource(R.string.app_name)) }
                        )
                    }
                ) {
                    ContentView()
                }
            }
        }
    }
}

@Composable
private fun ContentView() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = ExamplePadding)
            .verticalScroll(rememberScrollState()),
    ) {
        VExample("Text")
        FlowRow {
            ExampleItem("Text", TextActivity::class)
            ExampleItem("Text Field", TextFieldActivity::class)
        }
        VExample("Image")
        FlowRow {
            ExampleItem("Image", ImageActivity::class)
        }
        VExample("Layout")
        FlowRow {
            ExampleItem("Basics", StandardLayoutActivity::class)
        }
        VExample("State")
        FlowRow {
            ExampleItem("State", StateActivity::class)
        }
        VExample("Lists")
        FlowRow {
            ExampleItem("LazyColumn", LazyColumnActivity::class)
            ExampleItem("LazyRow", LazyRowActivity::class)
        }
    }
}