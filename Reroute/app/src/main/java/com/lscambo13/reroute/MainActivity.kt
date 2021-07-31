package com.lscambo13.reroute

import android.content.Context
import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val am: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        println("Status on start: "+am.isSpeakerphoneOn.toString())
        when (am.isSpeakerphoneOn) {
            true -> {
                am.isSpeakerphoneOn = false
                am.mode = AudioManager.MODE_NORMAL
                Toast.makeText(this, "Speaker Off", Toast.LENGTH_SHORT).show()
            }
            false -> {
                am.mode = AudioManager.MODE_IN_COMMUNICATION
                am.isSpeakerphoneOn = true
                Toast.makeText(this, "Speaker On", Toast.LENGTH_SHORT).show()
            }
        }
        println("Status on exit: "+am.isSpeakerphoneOn.toString())
        finish()
    }
}