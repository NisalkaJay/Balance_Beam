package com.example.balancebeam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class home: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val trans: ImageView = findViewById(R.id.imageView33)
        val stat : ImageView = findViewById(R.id.imageView28)
        val pro : ImageView = findViewById(R.id.imageView32)
        val add : View = findViewById(R.id.circle1)


        trans.setOnClickListener{
            val intent = Intent(this,transaction::class.java)
            startActivity(intent)

            stat.setOnClickListener {
                val intent = Intent (this,statistics::class.java);
                startActivity(intent) }

            pro.setOnClickListener {
                val intent = Intent (this,profile::class.java);
                startActivity(intent) }

            add.setOnClickListener {
                val intent = Intent (this,add_new::class.java);
                startActivity(intent) }

        }
    }
}