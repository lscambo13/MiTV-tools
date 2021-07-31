package com.lscambo13.tv.settings.shortcut

import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



//        val intent = Intent(Intent.ACTION_MAIN)
//        intent.component = ComponentName("com.android.tv.settings", "com.android.tv.settings.MainSettings")
//        startActivity(intent)
//        finish()

        //val intent = Intent(Intent.ACTION_MAIN)
        val settings = Intent("android.settings.SETTINGS")
        startActivity(settings)
        finish()


//        val intent = Intent(Intent.ACTION_MAIN)
//        val pictureComponent = intent.setComponent(
//            ComponentName(
//                "com.android.tv.settings",
//                "com.xiaomi.mitv.settings.picture.PictureActivity"
//            )
//        )

//        val intent = Intent(Intent.ACTION_MAIN)
//        val soundComponent = intent.setComponent(
//            ComponentName(
//                "com.android.tv.settings",
//                "com.xiaomi.mitv.settings.sound.SoundActivity"
//            )
//        )
//        startActivity(pictureComponent)

//        try {
//            intent.setClassName("com.android.tv.settings", "com.android.tv.settings/com.xiaomi.mitv.settings.picture.PictureActivity")
//              val intent = Intent(Intent.ACTION_MAIN)

//            intent.setClassName("com.android.tv.settings", "com.android.tv.settings/com.xiaomi.mitv.settings.picture.AdjustValueActivity")
//            startActivity(intent)
//        } catch (ERROR : ActivityNotFoundException) {
//            val settings = packageManager.getLeanbackLaunchIntentForPackage("com.android.tv.quicksettings")
//            //intent.setClassName("com.android.tv.settings", "com.android.tv.settings.MainSettings")
//            startActivity(settings)
//            Toast.makeText(applicationContext, "Not a Xiaomi?", Toast.LENGTH_SHORT).show()
//        }


        //val setting = packageManager.getLeanbackLaunchIntentForPackage("com.android.tv.settings")
        //startActivity(setting)
    }
}