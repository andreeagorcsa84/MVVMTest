package com.example.mvvmtest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TestModel() {

    // codec can take the values 0, 1, 2, 3, 4 in hexadecimal
    val codec = arrayOf(0,1,2,3,4)
    // model can take the values 0, 1, 3, 4 in hexadecimal
    val model = arrayOf(0,1,3)
    val streamId = arrayOf(0X00..0XFF)
    val frameSize : Array<IntRange> = arrayOf(0..256)


    private val _extraData = MutableLiveData<String>()
    val extraData : LiveData<String>
    get() = _extraData
}