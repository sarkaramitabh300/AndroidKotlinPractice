package com.amitabh.kotlinmvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Double) : ViewModel() {
    var count = MutableLiveData<Double>()

    init {
        count.value = startingTotal
    }


    fun getUpdateCount(inputValue: Double) {
        count.value = (count.value)?.plus(inputValue)
    }
}