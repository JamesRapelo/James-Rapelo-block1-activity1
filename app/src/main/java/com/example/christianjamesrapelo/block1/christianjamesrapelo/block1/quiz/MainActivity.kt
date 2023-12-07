package com.example.christianjamesrapelo.block1.christianjamesrapelo.block1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var nextPage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextPage = findViewById(R.id.nextArrow)

        nextPage.setOnClickListener {
            val intent = Intent(this, Page2 :: class.java)
            startActivity(intent)
        }
    }
}