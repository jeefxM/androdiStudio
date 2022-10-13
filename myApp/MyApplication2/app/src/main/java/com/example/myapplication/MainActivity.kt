package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstNumber = findViewById<EditText>(R.id.firstNum)
        val secondNumber = findViewById<EditText>(R.id.secondNum)


        val firstNum = firstNumber.text.toString().toIntOrNull() ?: 0
        val secondNum = secondNumber.text.toString().toIntOrNull() ?: 0

        val plusBtn = findViewById<Button>(R.id.plusBtn)
        val minusBtn = findViewById<Button>(R.id.minusBtn)
        val multiplyBtn = findViewById<Button>(R.id.multiplyBtn)
        val divideBtn = findViewById<Button>(R.id.divideBtn)
        plusBtn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        minusBtn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        multiplyBtn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        divideBtn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}





























//        val firstNumber = findViewById<EditText>(R.id.firstNum)
//        val secondNumber = findViewById<EditText>(R.id.secondNum)
////        val num1 = firstNumber.toString().toInt()
////        val num2 = secondNumber.toString().toInt()
//
//
////        val tx = findViewById<View>(android.R.id.numText) as EditText
////        val amount = tx.text.toString().toInt()
//
//
//        val plusBtn = findViewById<Button>(R.id.button1)
//        plusBtn.setOnClickListener() {
//
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.add(firstNumber.toString().toInt(), secondNumber.toString().toInt())
//            startActivity(intent)
//
//
//            val minusBtn = findViewById<Button>(R.id.button2)
//            minusBtn.setOnClickListener() {
//                val intent = Intent(this, SecondActivity::class.java)
////                intent.minus(num1, num2)
//                startActivity(intent)
//            }
//
//            val multiplyBtn = findViewById<Button>(R.id.button3)
//            multiplyBtn.setOnClickListener() {
//                val intent = Intent(this, SecondActivity::class.java)
////                intent.multiply(num1, num2)
//                startActivity(intent)
//            }
//
//            val divideBtn = findViewById<Button>(R.id.button4)
//            divideBtn.setOnClickListener() {
//                val intent = Intent(this, SecondActivity::class.java)
////                intent.divide(num1, num2)
//                startActivity(intent)
//
//
//            }
//
//
//        }
//
//
//    }
//
//}
//
//private fun Intent.add(num1: Int, num2: Int): Int {
//    return num1 + num2
//}
//
//private fun Intent.minus(num1: Int, num2: Int): Int{
//    return num1 - num2
//}
//
//private fun Intent.multiply(num1: Int, num2: Int): Int{
//    return num1 * num2
//}
//
//private fun Intent.divide(num1: Int, num2: Int): Int{
//    return num1 / num2
//}
////
////

