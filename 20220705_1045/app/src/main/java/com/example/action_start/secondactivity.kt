package com.example.action_start

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        /* set title */

        val actionBar = supportActionBar
        actionBar!!.title = "Second Activity"

        actionBar.setDisplayHomeAsUpEnabled(true)
        val secondBtn: Button = findViewById(R.id.button_Screen2)
        val secondText: TextView = findViewById(R.id.numberxyz)
        val result: TextView = findViewById(R.id.result)
        secondBtn.setOnClickListener() {

            val doubley = secondText.text.toString().toDoubleOrNull()      // toLong()    // toDouble()

            val doubley1 = doubley * 3

            result.text = doubley1.toString()

        }




    }
}