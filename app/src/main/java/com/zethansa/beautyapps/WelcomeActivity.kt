package com.zethansa.beautyapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    //    Button
    fun goLogin(view: View?) {
        val intent = Intent(this@WelcomeActivity, Login::class.java)
        startActivity(intent)
    }

    fun goRegister(view: View?) {
        val intent = Intent(this@WelcomeActivity, Register::class.java)
        startActivity(intent)
    }
}