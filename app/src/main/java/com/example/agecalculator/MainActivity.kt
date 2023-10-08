package com.example.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var calculatebutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculatebutton = findViewById(R.id.calculatebutton) as Button
        calculatebutton.setOnClickListener{
            val futureyear = findViewById<EditText>(R.id.futureyear).text.toString().trim()
            val userage = findViewById<EditText>(R.id.birthyear).text.toString().trim()
            if (userage=="" ||futureyear==""){
                Toast.makeText(this, "please enter a year",Toast.LENGTH_LONG).show()
            }
            else if (userage > futureyear){
                Toast.makeText(this, "year should be less then",Toast.LENGTH_LONG).show()
            }
            else{
                val myAge= futureyear.toInt() - userage.toInt()
                findViewById<TextView>(R.id.futureage).text="I will be ${myAge.toString()} years old \n in $futureyear."

            }
        }

    }
}