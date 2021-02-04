package com.example.mvvmtest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// used for creating a ViewModel instance with parameters
class TestViewModelFactory(var repository : TestModel) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TestViewModel::class.java)) {
            return TestViewModel(repository) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }
}

