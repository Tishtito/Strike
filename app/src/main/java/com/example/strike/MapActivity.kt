package com.example.strike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MapActivity : AppCompatActivity() {
    lateinit var map1: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        map1=findViewById(R.id.map)

        map1.webViewClient= WebViewClient()
        map1.loadUrl("https://www.google.com/maps/place/Strikez+Bowling/@-1.2604097,36.7950188,15.66z/data=!4m6!3m5!1s0x182f17361287ad41:0xb6b8dd9270397b4c!8m2!3d-1.2570461!4d36.8033013!16s%2Fg%2F11lrlp8wj6?authuser=0&entry=ttu")
        map1.settings.javaScriptEnabled=true
        map1.settings.setSupportZoom(true)
    }
}