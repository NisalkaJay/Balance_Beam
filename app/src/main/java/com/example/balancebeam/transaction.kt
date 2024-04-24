package com.example.balancebeam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class transaction: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transaction)

        val home: ImageView = findViewById(R.id.imageView9)
        val stat: ImageView = findViewById(R.id.imageView6)
        val prof: ImageView = findViewById(R.id.imageView7)


        home.setOnClickListener {
            val intent = Intent(this,home::class.java)
            startActivity(intent)
        }
        stat.setOnClickListener {
            val intent = Intent(this,statistics::class.java)
            startActivity(intent)
        }
        prof.setOnClickListener {
            val intent = Intent(this,profile::class.java)
            startActivity(intent)
        }

    }
}