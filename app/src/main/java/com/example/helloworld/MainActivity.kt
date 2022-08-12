package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get reference to button
        //set up logic to know when user tapped button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handles button tap
            //Change text color
            Log.i("Anusha", "Text color button tapped")
            //Get reference to text view; set color of text view
            findViewById<TextView>(R.id.textView).setTextColor(Color.parseColor("#024a28"))
        }

        var newText = "Android is Awesome!"
        val textEdit = findViewById<EditText>(R.id.textEditor) as EditText

        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Anusha", "Text string button tapped")

            newText = textEdit.text.toString()
            if(newText.trim() == "") {
                newText = "Android is Awesome!"
            }
            Log.i("Anusha", newText)
            findViewById<TextView>(R.id.textView).setText(newText)

        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Anusha", "Bg color button tapped")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.parseColor("#d1b575"))
        }

        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener {
            findViewById<TextView>(R.id.textView).setText("Hello from Anusha!")

            findViewById<TextView>(R.id.textView).setTextColor(Color.parseColor("#820E4D"))

            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.parseColor("#38B4D3"))

            findViewById<EditText>(R.id.textEditor).setText("")
            Log.i("Anusha", "Settings reset")
        }
    }
}