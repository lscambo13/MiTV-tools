package com.lscambo13.tv.sound.shortcut

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SoundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(Intent.ACTION_MAIN)
        val soundComponent = intent.setComponent(
            ComponentName(
                "com.android.tv.settings",
                "com.xiaomi.mitv.settings.sound.SoundActivity"
            )
        )
        startActivity(soundComponent)
        finish()

    }
}