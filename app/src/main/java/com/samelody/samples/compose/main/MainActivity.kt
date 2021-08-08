package com.samelody.samples.compose.main

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.samelody.samples.compose.base.BaseActivity
import com.samelody.samples.compose.databinding.MainActivityBinding
import com.samelody.samples.compose.image.ImageActivity
import com.samelody.samples.compose.layout.StandardLayoutActivity
import com.samelody.samples.compose.list.LazyColumnActivity
import com.samelody.samples.compose.state.StateActivity
import com.samelody.samples.compose.text.TextActivity
import com.samelody.samples.compose.text.TextFieldActivity
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
        binding.text.setOnClickListener { startExample(TextActivity::class) }
        binding.textField.setOnClickListener { startExample(TextFieldActivity::class) }
        binding.image.setOnClickListener { startExample(ImageActivity::class) }
        binding.state.setOnClickListener { startExample(StateActivity::class) }
        binding.standardLayout.setOnClickListener { startExample(StandardLayoutActivity::class) }
        binding.list.setOnClickListener { startExample(LazyColumnActivity::class) }
    }

    private fun Activity.startExample(cls: KClass<out Activity>) {
        Intent(this, cls.java).apply {
            startActivity(this)
        }
    }
}