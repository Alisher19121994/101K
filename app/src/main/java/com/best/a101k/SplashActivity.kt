package com.best.a101k

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.PersistableBundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

       Handler().postDelayed({
           val intent = Intent(this, SignInActivity::class.java)
           startActivity(intent)
           finish()
       },2000)
        //initViews()
    }

    private fun initViews() {
        object : CountDownTimer(2000, 1000) {
            override fun onTick(l: Long) {}
            override fun onFinish() {
                getDatas()
            }
        }.start()
    }

    fun getDatas() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}