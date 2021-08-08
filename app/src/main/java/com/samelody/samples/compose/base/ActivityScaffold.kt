package com.samelody.samples.compose.base

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.samelody.samples.compose.theme.AppTheme

@Composable
fun ActivityScaffold(
    @StringRes title: Int,
    content: @Composable (PaddingValues) -> Unit
) {
    AppTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = stringResource(title)) }
                )
            },
            content = content
        )
    }
}