package com.example.fragmentlifecycle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, BlankFragment()).commit()
        }
    }
}