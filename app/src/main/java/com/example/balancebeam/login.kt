package com.example.balancebeam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class login: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val login : Button = findViewById(R.id.button)

        login.setOnClickListener {
            val intent = Intent (this, com.example.balancebeam.home::class.java);
            startActivity(intent) }
    }
}