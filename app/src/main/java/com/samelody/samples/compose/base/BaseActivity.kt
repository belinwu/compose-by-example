package com.samelody.samples.compose.base

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    override fun finish() {
        super.finish()
        overridePendingTransition(0, 0)
    }
}