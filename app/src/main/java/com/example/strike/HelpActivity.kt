package com.example.strike

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class HelpActivity : AppCompatActivity() {

    lateinit var Home: TextView
    lateinit var Activities: TextView
    lateinit var Help: TextView
    lateinit var Logout: ImageView
    lateinit var call:CardView
    lateinit var web:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        Home=findViewById(R.id.home)
        Activities=findViewById(R.id.activities)
        Help=findViewById(R.id.help)
        Logout=findViewById(R.id.logout)
        call=findViewById(R.id.cardCall)
        web=findViewById(R.id.cardWeb)

        Home.setOnClickListener {
            var myhome= Intent(this,HomeActivity::class.java)
            startActivity(myhome)
        }
        Activities.setOnClickListener {
            var myactivities= Intent(this,facilityfeatures::class.java)
            startActivity(myactivities)
        }
        Logout.setOnClickListener{
            var box= AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener{ dialog, id -> Intent(this,LoginActivity::class.java) })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener{ dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Strike App")
            alert.show()
        }
        Help.setOnClickListener {
            val intent = Intent(this,HelpActivity::class.java)
            startActivity(intent)
        }
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0746181146")
            startActivity(dialIntent)
        }
        web.setOnClickListener {
            val broswerIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://strikez.co.ke/")
            )
            startActivity(broswerIntent)
        }
    }
}