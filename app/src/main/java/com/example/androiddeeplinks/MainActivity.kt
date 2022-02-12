package com.example.androiddeeplinks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Hitting url: https://developer.android.com/training/app-links/deep-linking

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)

        val uri: Uri? = intent.data
        uri?.let {
            val path = it.toString()
            Toast.makeText(this, path, Toast.LENGTH_LONG).show()

            webView.loadUrl(path)
        }
    }
}