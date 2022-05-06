package com.best.a101k

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    private val TAG = SignUpActivity::class.java.toString()
    private lateinit var fullname_ID_sign_up: EditText
    private lateinit var email_ID_sign_up: EditText
    private lateinit var password_ID_sign_up: EditText
    private lateinit var confirm_password_ID_sign_up: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        getData()
    }

    private fun getData() {

        fullname_ID_sign_up = findViewById(R.id.fullname_ID_sign_up)
        email_ID_sign_up = findViewById(R.id.email_ID_sign_up)
        password_ID_sign_up = findViewById(R.id.password_ID_sign_up)
        confirm_password_ID_sign_up = findViewById(R.id.confirm_password_ID_sign_up)

        val button: Button = findViewById(R.id.button_ID_sign_up)
        button.setOnClickListener { finish() }

        val textView: TextView = findViewById(R.id.tv_sign_in)
        textView.setOnClickListener { finish() }
    }
}

