package com.example.view_data_binding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    private val _myName: MutableLiveData<String> = MutableLiveData("")
    val myName: LiveData<String> = _myName

    private val _greeting: MutableLiveData<String> = MutableLiveData("")
    val greeting: LiveData<String> = _greeting

    fun setMyName(myName: String) {
        _myName.value = myName
    }

    fun setGreeting(greeting: String) {
        _greeting.value = "Hola a todos!!"
    }
}