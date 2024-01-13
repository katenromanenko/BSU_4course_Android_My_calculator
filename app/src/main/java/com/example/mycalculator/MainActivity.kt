package com.example.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val a = findViewById<EditText>(R.id.editTextA)
        val b = findViewById<EditText>(R.id.editTextB)
        val res = findViewById<TextView>(R.id.textViewResult)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)


                btn1.setOnClickListener{
            val n = a.text.toString().toDoubleOrNull()
            val m = b.text.toString().toDoubleOrNull()

            if (n!=null && m!=null){
                 res.setText("$n + $m=${n+m}")
            }

        }

        btn2.setOnClickListener{
            val n = a.text.toString().toDoubleOrNull()
            val m = b.text.toString().toDoubleOrNull()

            if (n!=null && m!=null){
                res.setText("$n - $m=${n-m}")
            }

        }

        btn3.setOnClickListener{
            val n = a.text.toString().toDoubleOrNull()
            val m = b.text.toString().toDoubleOrNull()

            if (n!=null && m!=null){
                res.setText("$n * $m=${n*m}")
            }

        }

        btn4.setOnClickListener{
            val n = a.text.toString().toDoubleOrNull()
            val m = b.text.toString().toDoubleOrNull()

            if (n!=null && m!=null){
                res.setText("$n / $m=${n/m}")
            }

        }




    }


}