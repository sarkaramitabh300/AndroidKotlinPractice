package com.amitabh.kotlinmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.amitabh.kotlinmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
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