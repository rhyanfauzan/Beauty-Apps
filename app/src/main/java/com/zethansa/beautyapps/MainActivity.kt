package com.zethansa.beautyapps

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    Button
    fun goLogin(view: View?) {
        val intent = Intent(this@MainActivity, Login::class.java)
        startActivity(intent)
    }

    fun goRegister(view: View?) {
        val intent = Intent(this@MainActivity, Register::class.java)
        startActivity(intent)
    }

}