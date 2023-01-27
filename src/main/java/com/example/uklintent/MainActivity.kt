package com.example.uklintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var btn_login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editEmail = findViewById(R.id.editEmail)
        editPassword = findViewById(R.id.editPassword)
        btn_login = findViewById(R.id.btn_login)

        btn_login.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var emptyEmail: Boolean = false
        var emptyPassword: Boolean = false

        if (editEmail.text.toString().trim().length == 0) {
            editEmail.error = "Email harus terisi"
            emptyEmail = true }

        if (editPassword.text.toString().trim().length == 0) {
            editPassword.error = "Password harus terisi"
            emptyPassword = true }

        if (!emptyEmail && !emptyPassword) {
            val dataReceived = Intent(this@MainActivity, hasilActivity::class.java)
            val email = editEmail.text.toString()
            dataReceived.putExtra("String", email)
            startActivity(dataReceived)

        }
    }
}