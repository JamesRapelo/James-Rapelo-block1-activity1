package com.example.christianjamesrapelo.block1.christianjamesrapelo.block1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Page2 : AppCompatActivity() {

    private lateinit var backPage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        backPage = findViewById(R.id.backArrow)
    }
}