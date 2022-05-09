package com.zethansa.beautyapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.smarteist.autoimageslider.SliderView

class HomeActivity : AppCompatActivity() {

    lateinit var bottomnavigation: BottomNavigationView

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

//        image slider

//        val imageSlider = findViewById<SliderView>(R.id.imageSlider)
//        val imageList: ArrayList<String> = ArrayList()
//        imageList.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg")
//        imageList.add("https://images.ctfassets.net/hrltx12pl8hq/4plHDVeTkWuFMihxQnzBSb/aea2f06d675c3d710d095306e377382f/shutterstock_554314555_copy.jpg")
//        imageList.add("https://media.istockphoto.com/photos/child-hands-formig-heart-shape-picture-id951945718?k=6&m=951945718&s=612x612&w=0&h=ih-N7RytxrTfhDyvyTQCA5q5xKoJToKSYgdsJ_mHrv0=")
//        setImageInSlider(imageList, imageSlider)
//    }
//
//    private fun setImageInSlider(images: ArrayList<String>, imageSlider: SliderView) {
//        val adapter = MySliderImageAdapter()
//        adapter.renewItems(images)
//        imageSlider.setSliderAdapter(adapter)
//        imageSlider.isAutoCycle = true
//        imageSlider.startAutoCycle()
    }

//end image slider

                                                                                                                                                                                            
    fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit()
    }


//    Button

    fun goChatfromHome(view: View?) {

        val text = "Silahkan pilih Dokter !"
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

    fun goBackButton(view: View?) {

        val text = "Kembali"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

//        move back fragment
        val fragment = ChatFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit()
    }

    fun goDetailDokter(view: View?) {

        val text = "Detail informasi Dokter"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

//      move fragment to detail
        val fragment = DetailDokterFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit()
    }

    fun goDetailChat(view: View?) {

        val text = "Chat Dokter"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

//      move fragment to detail
        val fragment = DetailChatFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit()
    }

    fun goProduk(view: View?) {

        val text = "Produk"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

        // set true
        bottomnavigation=findViewById(R.id.bottomnavigation);
        bottomnavigation.getMenu().findItem(R.id.nav_favorite).setChecked(true);

//      move fragment to detail
        val fragment = FavoriteFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit()
    }

    fun goDetailProduk(view: View?) {

//      move fragment to detail
        val fragment = DetailProdukFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit()
    }

    fun tambahKeranjang(view: View?) {

        val text = "Memasukan ke dalam keranjang"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

    }

}


