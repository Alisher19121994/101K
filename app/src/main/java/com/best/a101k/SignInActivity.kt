package com.best.a101k

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    private val TAG = SignInActivity::class.java.toString()
    private var email_ID_sign_in: EditText? = null
    private var password_ID_sign_in: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        open()
    }

    private fun open() {
        email_ID_sign_in = findViewById(R.id.et_email)
        password_ID_sign_in = findViewById(R.id.et_password)

        val button = findViewById<Button>(R.id.b_signin)
        button.setOnClickListener { openData() }

        val textView = findViewById<TextView>(R.id.tv_signup)
        textView.setOnClickListener { getData() }
    }

    private fun openData() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun getData() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

}