package com.example.balancebeam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class statistics: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistics)

        val home: ImageView = findViewById(R.id.imageView25)
        val trans: ImageView = findViewById(R.id.imageView27)
        val pro : ImageView = findViewById(R.id.imageView26)
        val add : View = findViewById(R.id.circle1)

        home.setOnClickListener {
            val intent = Intent(this,home::class.java)
            startActivity(intent)}
        trans.setOnClickListener {
            val intent = Intent(this,transaction::class.java)
            startActivity(intent)}
        pro.setOnClickListener {
            val intent = Intent(this,profile::class.java)
            startActivity(intent)}
        add.setOnClickListener {
            val intent = Intent(this,add_new::class.java)
            startActivity(intent)}

    }
}