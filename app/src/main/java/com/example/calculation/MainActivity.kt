package com.example.calculation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.ettpNum1)
        val number2 = findViewById<EditText>(R.id.ettpNum2)
        val addButton = findViewById<Button>(R.id.btnAdd)
        val subButton = findViewById<Button>(R.id.btnSub)
        val multButton = findViewById<Button>(R.id.btnMult)
        val divButton = findViewById<Button>(R.id.btnDiv)
        val total = findViewById<TextView>(R.id.tvResult)
        val clear = findViewById<Button>(R.id.btnClear)


        addButton.setOnClickListener {
            val numberOne = number1.text.toString()
            val numberTwo = number2.text.toString()

            if (numberOne.isEmpty() || numberTwo.isEmpty()) {
                    Toast.makeText(this, "Please enter input", Toast.LENGTH_SHORT).show()
                }

            else {
                val double1: Double = numberOne.toDouble()
                val double2: Double = numberTwo.toDouble()

            val result = double2.let { it1 -> double1.plus(it1) }
            total.setText(result.toString())
                }
            }

            subButton.setOnClickListener {
                val numberOne = number1.text.toString()
                val numberTwo = number2.text.toString()

                if (numberOne.isEmpty() || numberTwo.isEmpty()) {
                    Toast.makeText(this, "Please enter input", Toast.LENGTH_SHORT).show()
                }

                else {
                    val double1: Double = numberOne.toDouble()
                    val double2: Double = numberTwo.toDouble()

                    val result = double2.let { it1 -> double1.minus(it1) }
                    total.setText(result.toString())
                }
            }

            multButton.setOnClickListener {
                val numberOne = number1.text.toString()
                val numberTwo = number2.text.toString()

                if (numberOne.isEmpty() || numberTwo.isEmpty()) {
                    Toast.makeText(this, "Please enter input", Toast.LENGTH_SHORT).show()
                }

                else {
                    val double1: Double = numberOne.toDouble()
                    val double2: Double = numberTwo.toDouble()

                    val result = double2.let { it1 -> double1.times(it1) }
                    total.setText(result.toString())
                }
            }

            divButton.setOnClickListener {
                val numberOne = number1.text.toString()
                val numberTwo = number2.text.toString()

                if (numberOne.isEmpty() || numberTwo.isEmpty()) {
                    Toast.makeText(this, "Please enter input", Toast.LENGTH_SHORT).show()
                } else {
                    val double1: Double = numberOne.toDouble()
                    val double2: Double = numberTwo.toDouble()

                    val result = double2.let { it1 -> double1.div(it1) }
                    total.setText(result.toString())
                }
            }

            clear.setOnClickListener {
                number1.setText("")
                number2.setText("")
                total.setText("")
            }


        }
    }

