package com.zethansa.beautyapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
    }

    //        Button
    fun goRegisterfromForgot() {
        val intent = Intent(this@ForgotPassword, Register::class.java)
        startActivity(intent)
    }
}