package com.amitabh.kotlinmvvm

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count: Double = 0.0

    fun getCurrentCount(): Double {
        return count
    }

    fun getUpdateCount(value: Double): Double {
        count += value
        return count
    }
}