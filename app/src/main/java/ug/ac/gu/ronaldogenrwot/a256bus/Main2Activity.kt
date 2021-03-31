package ug.ac.gu.ronaldogenrwot.a256bus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Main2Activity : AppCompatActivity() {
    private val webView : WebView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val webView = findViewById<WebView>(R.id.webview)
        webView?.loadUrl("http://256bus.com/index.php")
        val webSettings=webView?.settings
        webSettings?.javaScriptEnabled=true
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()){webView.goBack()}
        else {
            super.onBackPressed()
        }
    }

}
