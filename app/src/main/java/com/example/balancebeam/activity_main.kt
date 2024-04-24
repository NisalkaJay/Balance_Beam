package com.example.balancebeam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class activity_main: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val main : Button = findViewById(R.id.button)


        main.setOnClickListener {
            val intent = Intent (this,login::class.java);
            startActivity(intent) }



    }
} 