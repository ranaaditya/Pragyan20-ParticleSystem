package com.rana_aditya.pragyan_splash

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.pm.ConfigurationInfo
import android.graphics.BitmapFactory
import android.graphics.Point
import android.os.Bundle
import android.util.Log
import android.view.Display
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rana_aditya.pragyan_splash.RippleView.AnimationUtil
import com.rana_aditya.pragyan_splash.RippleView.GLRippleView
import kotlinx.android.synthetic.main.activity_main.*
import rb.popview.PopField
import tyrantgit.explosionfield.ExplosionField
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {

    private lateinit var popField : PopField
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        glRippleView.run {
//            listener = this@MainActivity.listener
//            addBackgroundImages(listOf(
//                BitmapFactory.decodeResource(resources, R.drawable.appback),
//                BitmapFactory.decodeResource(resources, R.drawable.appback)
//            ))
//            setFadeInterval(TimeUnit.SECONDS.toMillis(500))
//            startCrossFadeAnimation()
//            setRippleOffset(0.01f)
//        }
       // glrippleview.setRippleOffset(0.005f)
        glrippleview.listener=listener
        //glrippleview.setFadeDuration(5000)

    }


    private val glRippleView: GLRippleView by lazy {
        findViewById(R.id.glrippleview) as GLRippleView
    }

    private val windowWidth: Float by lazy {
        getWidth(this)
    }

    private val windowHeight: Float by lazy {
        getHeight(this)
    }

    private val listener: GLRippleView.Listener = object : GLRippleView.Listener {
        override fun onTouchEvent(event: MotionEvent) {
            if (event.action == MotionEvent.ACTION_MOVE) {
                // center position
                //glRippleView.setRippleOffset(0.005f)
                glRippleView.setRipplePoint(Pair(
                    AnimationUtil.map(event.x, 0f, windowWidth, -1f, 1f),
                    AnimationUtil.map(event.y, 0f, windowHeight, -1f, 1f)
                ))

                // offset (x)
                (AnimationUtil.map(event.x / windowWidth, 0f, 1f, 0f, 0.02f)).let { value ->
                    Log.d(this.javaClass.name, "rippleOffset : " + value)
                    glRippleView.setRippleOffset(value)
                    glrippleview.setRippleOffset(0.0025BEf)
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        glRippleView.onResume()
    }

    override fun onStop() {
        glRippleView.onPause()
        super.onStop()
    }

    fun getWidth(context: Context): Float {
        val display = getDisplay(context)
        val size = Point()
        display.getSize(size)
        return size.x.toFloat()
    }

    fun getHeight(context: Context): Float {
        val display = getDisplay(context)
        val size = Point()
        display.getSize(size)
        return size.y.toFloat()
    }

    private fun getDisplay(context: Context): Display {
        return (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay
    }
}
