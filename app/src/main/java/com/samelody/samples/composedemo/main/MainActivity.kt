package com.samelody.samples.composedemo.main

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.samelody.samples.composedemo.base.BaseActivity
import com.samelody.samples.composedemo.databinding.MainActivityBinding
import com.samelody.samples.composedemo.layout.StandardLayoutActivity
import com.samelody.samples.composedemo.state.StateActivity
import com.samelody.samples.composedemo.text.SimpleTextActivity
import kotlin.reflect.KClass

class MainActivity : BaseActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.simpleText.setOnClickListener { startExample(SimpleTextActivity::class) }
        binding.state.setOnClickListener { startExample(StateActivity::class) }
        binding.standardLayout.setOnClickListener { startExample(StandardLayoutActivity::class) }
    }

    private fun Activity.startExample(cls: KClass<out Activity>) {
        Intent(this, cls.java).apply {
            startActivity(this)
        }
    }
}