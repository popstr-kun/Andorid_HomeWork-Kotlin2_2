package com.example.andorid_homework_kotlin2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.andorid_homework_kotlin2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = adapter
    }
}

class ViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm){
    override fun getItem(position : Int) = when(position){
        0    -> FirstFragment()
        1    -> SecondFragment()
        else -> ThirdFragment()
    }

    override fun getCount() = 3
}