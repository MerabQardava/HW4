package com.example.hw4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var recyclerbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerbtn = findViewById(R.id.btn)

        recyclerbtn.setOnClickListener {

            var i = Intent(this,UserlistActivity::class.java)
            startActivity(i)
            finish()


        }
    }
}