package com.amitabh.kotlinmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.amitabh.kotlinmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(123.0)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)
        binding.showDataTv.text = viewModel.getCurrentCount().toString()

        binding.calculateBtn.setOnClickListener {
            var value = binding.inputNumberEt.text.toString()
            if (value.isEmpty()) {
                value = "0"
            }
            binding.showDataTv.text =
                viewModel.getUpdateCount(value.toDouble())
                    .toString()

        }

    }
}