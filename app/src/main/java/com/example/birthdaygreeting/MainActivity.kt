package com.example.birthdaygreeting
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wishButton.setOnClickListener {
            val name = editText.editableText.toString()
            Intent(this, greet::class.java).also {
                it.putExtra("extra-name", name)
                startActivity(it)
            }
        }
    }

}