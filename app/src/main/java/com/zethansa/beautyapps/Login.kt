package com.zethansa.beautyapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

//    Button
    fun goHome(view: View?) {
        val intent = Intent(this@Login, HomeActivity::class.java)
        startActivity(intent)
    }

    fun goForgotPassword(view: View?) {
        val intent = Intent(this@Login, ForgotPassword::class.java)
        startActivity(intent)
    }

}