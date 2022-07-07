package com.example.action_start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        /* set title */

        val actionBar = supportActionBar
        actionBar!!.title = "Second Activity"

        actionBar.setDisplayHomeAsUpEnabled(true)
        val secondBtn: Button = findViewById(R.id.button_Screen2)
        val secondText: TextView = findViewById(R.id.personName)



    }
}