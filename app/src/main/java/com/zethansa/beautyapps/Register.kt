package com.zethansa.beautyapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

//Button
    fun goLogin(view: View?) {
        val intent = Intent(this@Register, Login::class.java)
        startActivity(intent)
    }
}