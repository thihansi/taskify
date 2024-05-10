package com.example.taskmanagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count: TextView = findViewById(R.id.number)
        val button: Button = findViewById(R.id.button)
        var number = 0

        button.setOnClickListener {

        }


    }
}