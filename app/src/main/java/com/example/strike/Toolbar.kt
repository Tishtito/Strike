package com.example.strike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Toolbar : AppCompatActivity() {

    lateinit var Home:TextView
    lateinit var Activities:TextView
    lateinit var Help:TextView
    lateinit var Logout:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        Home=findViewById(R.id.home)
        Activities=findViewById(R.id.activities)
        Help=findViewById(R.id.help)
        Logout=findViewById(R.id.logout)

        Home.setOnClickListener {
            var myhome=Intent(this,HomeActivity::class.java)
            startActivity(myhome)
        }
        Activities.setOnClickListener {
            var myactivities=Intent(this,facilityfeatures::class.java)
            startActivity(myactivities)
        }
        Help.setOnClickListener {
            var mylogout=Intent(this,LoginActivity::class.java)
            startActivity(mylogout)
        }
    }
}