package com.example.kotejafaridze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.resultTextView)
    }

    fun numberclick(clickedView: View) {
        if(clickedView is TextView){
            val result = resultTextView.text.toString()
            val number = clickedView.text.toString()

            resultTextView.text = result + number

        }
    }
}