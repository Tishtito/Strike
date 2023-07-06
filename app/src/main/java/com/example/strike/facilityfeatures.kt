package com.example.strike

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable

class facilityfeatures : AppCompatActivity() {

    lateinit var Home: TextView
    lateinit var Activities: TextView
    lateinit var Help: TextView
    lateinit var Logout: ImageView
    lateinit var gettickets: TextView
    lateinit var jointeam: TextView
    lateinit var viewprices : TextView
    lateinit var booksession : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facilityfeatures)

        Home = findViewById(R.id.home)
        Activities = findViewById(R.id.activities)
        Help = findViewById(R.id.help)
        Logout = findViewById(R.id.logout)
        gettickets = findViewById(R.id.get)
        jointeam = findViewById(R.id.join)
        viewprices = findViewById(R.id.view)
        booksession = findViewById(R.id.book)

        Home.setOnClickListener {
            var myhome = Intent(this, HomeActivity::class.java)
            startActivity(myhome)
        }
        Activities.setOnClickListener {
            var myactivities = Intent(this, facilityfeatures::class.java)
            startActivity(myactivities)
        }
        Logout.setOnClickListener {
            Toast.makeText(applicationContext, "You've clicked on logout!", Toast.LENGTH_SHORT)
                .show()
            var box = AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton(
                "PROCEED",
                DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton(
                "CANCEL",
                DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert = box.create()
            alert.setTitle("Strike App")
            alert.show()

            var mylogout = Intent(this, LoginActivity::class.java)
            startActivity(mylogout)
        }
        gettickets.setOnClickListener {
            var intent = Intent(this, BlowingActivity::class.java)
            startActivity(intent)
        }
        jointeam.setOnClickListener {
            var intent = Intent(this,LasertagActivity::class.java)
            startActivity(intent)
        }
        viewprices.setOnClickListener {
            var intent = Intent(this,ArcadeActivity::class.java)
            startActivity(intent)
        }
        booksession.setOnClickListener {
            var intent = Intent(this,BilliardsActivity::class.java)
            startActivity(intent)
        }
        Help.setOnClickListener {
            val intent = Intent(this,HelpActivity::class.java)
            startActivity(intent)
        }
    }
}