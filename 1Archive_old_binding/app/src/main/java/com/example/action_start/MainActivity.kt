package com.example.action_start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        val secondActivityBtn: Button = findViewById(R.id.SecondActivityBtn)
        secondActivityBtn.setOnClickListener() {
            val intent = Intent(this, secondactivity::class.java)
            startActivity(intent)
        }
    }
}


