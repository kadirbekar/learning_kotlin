package com.example.learningkotlinseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var showMessageButton:Button
    private lateinit var messageTextView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        messageTextView = findViewById(R.id.messageTextView)
        showMessageButton = findViewById(R.id.showMessageButton)

        showMessageButton.setOnClickListener {
            messageTextView.text = "Hello World!"
        }
    }
}