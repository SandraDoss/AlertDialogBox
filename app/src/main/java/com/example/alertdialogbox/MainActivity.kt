package com.example.alertdialogbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMessage : EditText = findViewById(R.id.etMessage)
        val btDisplay : Button = findViewById(R.id.btDisplay)

        btDisplay.setOnClickListener{

            val alertDialog = AlertDialog.Builder(this)
                .setTitle("MAD Lab")
                .setMessage(etMessage.text.toString())
                .setPositiveButton("OK") {dialog, which ->
                    // Your logic when OK button is clicked

                    Toast.makeText(applicationContext,"OK message", Toast.LENGTH_SHORT).show();
                }

                .setNegativeButton("Cancel") {dialog, which ->
                    // Your logic when Cancel button is clicked

                    Toast.makeText(applicationContext,"OK message when negative button", Toast.LENGTH_SHORT).show();
                }
                .create()
            alertDialog.show()



        }


    }
}