package com.example.strike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ArcadeActivity : AppCompatActivity() {

    lateinit var backarrow: ImageView
    lateinit var backhome: ImageView
    lateinit var pay1:Button
    lateinit var pay2:Button
    lateinit var adv:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arcade)

        backarrow=findViewById(R.id.backwards)
        backhome=findViewById(R.id.home)
        pay1=findViewById(R.id.onegame)
        pay2=findViewById(R.id.perhour)
        adv=findViewById(R.id.ad)

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
        adv.setOnClickListener {
            var intent = Intent(this,arcadevideoActivity::class.java)
            startActivity(intent)
        }
    }
}