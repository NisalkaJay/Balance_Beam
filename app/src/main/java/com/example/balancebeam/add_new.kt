package com.example.balancebeam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class add_new: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new)

        val back : ImageView = findViewById(R.id.imageView10)

        back.setOnClickListener {
            val intent = Intent(this,back::class.java)
            startActivity(intent)
        }
    }
}