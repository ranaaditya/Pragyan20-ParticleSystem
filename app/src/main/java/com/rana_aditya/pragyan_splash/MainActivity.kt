package com.rana_aditya.pragyan_splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    play()
    }
    private fun play(){
//        mainsplash.setAnimation("android.json")
        mainsplash.playAnimation()
    }
}
