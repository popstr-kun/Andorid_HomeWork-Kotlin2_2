package com.example.andorid_homework_kotlin2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andorid_homework_kotlin2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        
    }
}