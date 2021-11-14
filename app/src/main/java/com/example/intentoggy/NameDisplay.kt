package com.example.intentoggy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NameDisplay : AppCompatActivity() {

    lateinit var characterName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_display)

        characterName = findViewById(R.id.textView2)
        characterName.text = "Oggy"
        //dynamic seeting of string
    }
}