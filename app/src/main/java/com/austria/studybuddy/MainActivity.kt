package com.austria.studybuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import com.austria.studybuddy.Fragments.HomeFragment
import com.austria.studybuddy.R.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val loginButton: Button = findViewById(id.login_button)
        val signupTextView: TextView = findViewById(id.signup_textView)

        loginButton.setOnClickListener {
            val intent = Intent(this, HomeNavActivity::class.java)
            startActivity(intent)
            finish() }

        signupTextView.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish() }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.HomeFrameLayout, HomeFragment())
        transaction.commit()

    }
}