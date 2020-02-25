package com.rana_aditya.pragyan_splash

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.pm.ConfigurationInfo
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import rb.popview.PopField
import tyrantgit.explosionfield.ExplosionField


class MainActivity : AppCompatActivity() {

    private lateinit var popField : PopField
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//         var intent =Intent(this,test::class.java)
//        startActivity(intent)
//        var  activityManager : ActivityManager = getSystemService(Context.ACTIVITY_SERVICE)
//        var  configurationInfo : ConfigurationInfo = activityManager.getDeviceConfigurationInfo()
//        var   supportsEs2 : Boolean = configurationInfo.reqGlEsVersion >= 0x20000
//
//        if (supportsEs2){
//            Toast.makeText(this@MainActivity,"YEAH YOU SUPPOrt",Toast.LENGTH_LONG).show()
//        }else {
//            Toast.makeText(this@MainActivity,"NO YOU DON'T SUPPOrt",Toast.LENGTH_LONG).show()
//
//        }

   // play()
//
//val view=findViewById<ImageView>(R.id.google)
//         popField = PopField.attach2Window(this@MainActivity)


    }

//    fun popit(view: View) {
//
//       // popField.popView(google,google,true)
////        val explosionField = ExplosionField.attach2Window(this)
////        explosionField.expandExplosionBound(600,600)
////            explosionField.explode(google)
//1
//    }
////    private fun play(){
//////        mainsplash.setAnimation("android.json")
//////        mainsplash.playAnimation()
////    }
}
