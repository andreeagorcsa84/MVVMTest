package com.example.mvvmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // TODO: add VMFactory, and VM to databinding

        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.eight_khz_button -> onEightKhzButtonClick()
                R.id.sixteen_khz_button -> onSixteenKhzButtonClick()
                R.id.set_data_button -> onSetDataButtonClick()
            }
        }
    }

    private fun onSetDataButtonClick() {
        Toast.makeText(this, "Set extra button was clicked!", Toast.LENGTH_SHORT).show()
    }

    private fun onSixteenKhzButtonClick() {
        TODO("Not yet implemented")
    }

    private fun onEightKhzButtonClick() {
        TODO("Not yet implemented")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}