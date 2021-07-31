package com.lscambo13.tv.pair.shortcut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ConnectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val connectBluetooth = Intent("com.google.android.intent.action.CONNECT_INPUT")
        startActivity(connectBluetooth)
        finish()
    }
}