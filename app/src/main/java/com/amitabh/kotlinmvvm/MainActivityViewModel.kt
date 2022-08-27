package com.amitabh.kotlinmvvm

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Double) : ViewModel() {
    private var count: Double = 0.0

    init {
        count = startingTotal
    }

    fun getCurrentCount(): Double {
        return count
    }

    fun getUpdateCount(value: Double): Double {
        count += value
        return count
    }
}