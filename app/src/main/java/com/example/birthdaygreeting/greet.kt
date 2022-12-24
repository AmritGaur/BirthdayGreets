package com.example.birthdaygreeting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greet.*

class greet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)
        val name=intent.getStringExtra("extra-name")
        greetText.text="Happy Birthday \n $name"
    }
}