package com.amitabh.kotlinmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Double) : ViewModel() {
    private var count = MutableLiveData<Double>()
    val totalCount: LiveData<Double>
        get() = count

    init {
        count.value = startingTotal
    }


    fun getUpdateCount(inputValue: Double) {
        count.value = (count.value)?.plus(inputValue)
    }
}