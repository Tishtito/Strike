package com.example.strike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LasertagActivity : AppCompatActivity() {

    lateinit var backarrow: ImageView
    lateinit var backhome: ImageView
    lateinit var pay1:Button
    lateinit var pay2:Button
    lateinit var video:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lasertag)

        backarrow=findViewById(R.id.back)
        backhome=findViewById(R.id.home)
        pay1=findViewById(R.id.onegame)
        pay2=findViewById(R.id.perhour)
        video=findViewById(R.id.ad)


        backhome.setOnClickListener {
            var intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        backarrow.setOnClickListener {
            var intent= Intent(this,facilityfeatures::class.java)
            startActivity(intent)
        }
        pay1.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        pay2.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        video.setOnClickListener {
            val intent = Intent(this,LasertagAd::class.java)
            startActivity(intent)
        }
    }
}