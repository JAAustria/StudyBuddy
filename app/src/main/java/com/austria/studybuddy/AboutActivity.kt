package com.austria.studybuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backButton: Button = findViewById(R.id.button3)
        backButton.setOnClickListener {
            finish()
        }
    }
}