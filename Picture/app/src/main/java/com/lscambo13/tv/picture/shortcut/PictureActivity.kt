package com.lscambo13.tv.picture.shortcut

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(Intent.ACTION_MAIN)
        val pictureComponent = intent.setComponent(
            ComponentName(
                "com.android.tv.settings",
                "com.xiaomi.mitv.settings.picture.PictureActivity"
            )
        )
        startActivity(pictureComponent)
        finish()

    }
}