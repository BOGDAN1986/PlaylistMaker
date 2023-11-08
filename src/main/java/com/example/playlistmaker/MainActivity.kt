package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.SearchButton)
        val buttonMediaLibrary = findViewById<Button>(R.id.MediaLibraryButton)
        val buttonSetting = findViewById<Button>(R.id.SettingsButton)

        val buttonClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                val buttonSearchIntent = Intent(this@MainActivity, SearchActivity::class.java)
                startActivity(buttonSearchIntent)
            }
        }
        buttonSearch.setOnClickListener(buttonClickListener)

        buttonMediaLibrary.setOnClickListener {
            val buttonMediaLibraryIntent = Intent(this, MediaLibraryActivity::class.java)
            startActivity(buttonMediaLibraryIntent)
        }
        buttonSetting.setOnClickListener {
            val buttonSettingIntent = Intent(this, SettingsActivity::class.java)
            startActivity(buttonSettingIntent)
        }
    }
}
