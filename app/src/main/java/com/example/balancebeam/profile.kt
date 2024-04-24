package com.example.balancebeam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class profile: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val home : ImageView= findViewById(R.id.imageView19)
        val trans : ImageView = findViewById(R.id.imageView18)
        val stat : ImageView = findViewById(R.id.imageView17)
        val add : View = findViewById(R.id.circle1)

        home.setOnClickListener {
            val intent = Intent(this,home::class.java)
            startActivity(intent)
        }
        trans.setOnClickListener {
            val intent = Intent(this,transaction::class.java)
            startActivity(intent)
        }
        stat.setOnClickListener {
            val intent = Intent(this,statistics::class.java)
            startActivity(intent)
        }
        add.setOnClickListener {
            val intent = Intent(this,add_new::class.java)
            startActivity(intent)
        }
    }
}