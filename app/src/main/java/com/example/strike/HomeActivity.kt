package com.example.strike

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable

class HomeActivity : AppCompatActivity() {

    lateinit var Home: TextView
    lateinit var Activities: TextView
    lateinit var Help: TextView
    lateinit var Logout: ImageView
    lateinit var insta: ImageView
    lateinit var fb: ImageView
    lateinit var adv: ImageView
    lateinit var vs: RelativeLayout
    lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Home = findViewById(R.id.home)
        Activities = findViewById(R.id.activities)
        Help = findViewById(R.id.help)
        Logout = findViewById(R.id.logout)
        insta = findViewById(R.id.instagram)
        fb = findViewById(R.id.facebook)
        adv = findViewById(R.id.ad)
        vs = findViewById(R.id.visitus)
        img = findViewById(R.id.imageView)


        Home.setOnClickListener {
            var myhome = Intent(this, HomeActivity::class.java)
            startActivity(myhome)
        }
        Activities.setOnClickListener {
            var myactivities = Intent(this, facilityfeatures::class.java)
            startActivity(myactivities)
        }
        Logout.setOnClickListener {
            var box = AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton(
                "PROCEED",
                DialogInterface.OnClickListener { dialog, id ->
                    Intent(
                        this,
                        LoginActivity::class.java
                    )
                })
            box.setNegativeButton(
                "CANCEL",
                DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert = box.create()
            alert.setTitle("Strike App")
            alert.show()
        }
        fb.setOnClickListener {
            val broswerIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://web.facebook.com/StrikezatWestgate/?_rdc=1&_rdr")
            )
            startActivity(broswerIntent)
        }
        insta.setOnClickListener {
            val broswerIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/strikezke/?hl=en"))
            startActivity(broswerIntent)
        }
        Help.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }
        adv.setOnClickListener {
            val intent = Intent(this, AdActivity::class.java)
            startActivity(intent)
        }
        vs.setOnClickListener{
            var intent = Intent(this,MapActivity::class.java)
            startActivity(intent)
        }
        img.setOnClickListener{
            var intent = Intent(this,SiteviewActivity::class.java)
            startActivity(intent)
        }
    }
}