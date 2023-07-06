package com.example.strike

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView

class BlowingActivity : AppCompatActivity() {

    lateinit var backarrow:ImageView
    lateinit var backhome:ImageView
    lateinit var pay1:Button
    lateinit var pay2:Button
    lateinit var video:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blowing)

        backarrow = findViewById(R.id.back)
        backhome = findViewById(R.id.home)
        pay1 = findViewById(R.id.onegame)
        pay2 = findViewById(R.id.perhour)
        video = findViewById(R.id.video)

        backhome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        backarrow.setOnClickListener {
            var intent = Intent(this, facilityfeatures::class.java)
            startActivity(intent)
        }
        pay1.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        pay2.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        video.setOnClickListener {
            var intent = Intent(this, bolwingadActivity::class.java)
            startActivity(intent)
        }
    }
}