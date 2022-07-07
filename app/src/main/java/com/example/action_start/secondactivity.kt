package com.example.action_start

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        /* set title */

        val actionBar = supportActionBar
        actionBar!!.title = "Second Activity"

        actionBar.setDisplayHomeAsUpEnabled(true)   // this is the back button

        val secondBtn: Button = findViewById(R.id.button_Screen2)
        val secondText: TextView = findViewById(R.id.numberxyz)
        val result: TextView = findViewById(R.id.result)

        secondBtn.setOnClickListener() {
            var doubley = try {
                 secondText.text.toString().toDouble()
            } catch (exception: NumberFormatException) {
                val text = "invalid number"
                val duration =  Toast.LENGTH_LONG
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.setGravity(Gravity.CENTER,110, 110)
                toast.show()
                return@setOnClickListener
            }

            var doubley1 = doubley * 3.22222
            result.text = doubley1.toString()
        }




    }
}