package com.doctorboss.app

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.content.Context
import android.print.PrintManager
import android.webkit.WebView
import android.view.View
import android.content.Context

class MainActivity : Activity() {
    private lateinit var web: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowFileAccess = true
        web.webViewClient = WebViewClient()
        web.webChromeClient = WebChromeClient()
        web.addJavascriptInterface(PrintBridge(this, web), "AndroidPrint")
        web.loadUrl("file:///android_asset/index.html")
        setContentView(web)
    }
    override fun onBackPressed() {
        if (web.canGoBack()) web.goBack() else super.onBackPressed()
    }
}
class PrintBridge(private val context: Context, private val web: WebView) {
    @android.webkit.JavascriptInterface
    fun printPage() {
        (context.getSystemService(Context.PRINT_SERVICE) as PrintManager)
            .print("تقرير دكتور بوس", web.createPrintDocumentAdapter("تقرير دكتور بوس"), null)
    }
}
