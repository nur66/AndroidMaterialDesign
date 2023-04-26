package com.example.androidmaterialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroActivity : AppCompatActivity() {

    lateinit var startButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_property)

        initView()
    }

    private fun initView() {
        startButton = findViewById(R.id.startButton)
//        startButton.setOnClickListener()

    }
}