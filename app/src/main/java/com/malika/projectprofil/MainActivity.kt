package com.malika.projectprofil

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<ImageView>(R.id.btn2)

        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)

        }
    }
}
