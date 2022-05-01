package com.zethansa.beautyapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var bottomnavigation: BottomNavigationView
    lateinit var goChatbtn: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        loadFragment(HomeFragment())

        bottomnavigation = findViewById(R.id.bottomnavigation) as BottomNavigationView
        bottomnavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.nav_favorite -> {
                    loadFragment(FavoriteFragment())
                    true
                }
                R.id.nav_cart -> {
                    loadFragment(CartFragment())
                    true
                }
                R.id.nav_chats -> {
                    loadFragment(ChatFragment())
                    true
                }
                R.id.nav_profile -> {
                    loadFragment(ProfileFragment())
                    true
                }

                else -> false
            }
        }

    }

    fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit()
    }


//    Button
    fun goLoginfromHome(view: View) {
        val intent = Intent(this@HomeActivity, ForgotPassword::class.java)
        startActivity(intent)
    }

    fun goChatfromHome(view: View) {

        val text = "Move to chat"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

// set true
        bottomnavigation=findViewById(R.id.bottomnavigation);
        bottomnavigation.getMenu().findItem(R.id.nav_chats).setChecked(true);

//        move fragment
        val fragment = ChatFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit()
    }

}


