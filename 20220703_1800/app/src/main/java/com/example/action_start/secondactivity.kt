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
        val result: TextView = findViewById(R.id.result)
        secondBtn.setOnClickListener() {
            val num1 = Integer.parseInt(secondText.text.toString())
            val num2 = num1 * 5
         /*   val num2 = (num1 / 5)  */

            result.text = num2.toString()
        }


    /*    val num1 = editText1.text */

    }
}