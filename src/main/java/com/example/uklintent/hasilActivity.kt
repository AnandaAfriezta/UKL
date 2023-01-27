package com.example.uklintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class hasilActivity : AppCompatActivity() {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        text = findViewById(R.id.emailText)

        val editEmail = intent.getStringExtra("String")
        if (editEmail != null){
            text.text = editEmail
        }
    }
}