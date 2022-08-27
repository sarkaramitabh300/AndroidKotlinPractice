package com.amitabh.kotlinmvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var count = MutableLiveData<Int>()

    init {
        count.value = 0;
    }

    fun updatedCount() {
        count.value=    count.value?.plus(1)
    }
}