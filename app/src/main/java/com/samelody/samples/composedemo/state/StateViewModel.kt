package com.samelody.samples.composedemo.state

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StateViewModel : ViewModel() {
    private var nameData = MutableLiveData("")
    val name: LiveData<String> get() = nameData

    fun onNameChanged(name: String) {
        nameData.value = name
    }
}