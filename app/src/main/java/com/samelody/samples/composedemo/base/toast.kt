package com.samelody.samples.composedemo.base

import android.content.Context
import android.widget.Toast

fun shortToast(context: Context, content: String) {
    Toast.makeText(context, content, Toast.LENGTH_SHORT).show()
}

fun longToast(context: Context, content: String) {
    Toast.makeText(context, content, Toast.LENGTH_LONG).show()
}