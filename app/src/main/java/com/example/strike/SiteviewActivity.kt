package com.example.strike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class SiteviewActivity : AppCompatActivity() {

    lateinit var webpage: WebView
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siteview)

        webpage=findViewById(R.id.web)
        btn=findViewById(R.id.mapview)

        webpage.webViewClient= WebViewClient()
        webpage.loadUrl("https://strikez.co.ke/")
        webpage.settings.javaScriptEnabled=true
        webpage.settings.setSupportZoom(true)

        btn.setOnClickListener {
            var mymap= Intent(this,MapActivity::class.java)
            startActivity(mymap)
        }
    }
}