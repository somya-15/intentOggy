package com.example.intentoggy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var checkName: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkName = findViewById(R.id.button)
        checkName.setOnClickListener{
            Intent(this, NameDisplay::class.java).also{ startActivity(it)}
        }
    }
}