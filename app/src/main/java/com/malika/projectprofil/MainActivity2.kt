package com.malika.projectprofil

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn = findViewById<ImageView>(R.id.biodata)
        val btn2 = findViewById<ImageView>(R.id.sekolah)
        val btn3 = findViewById<ImageView>(R.id.gambar)

        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)



        }

        btn2.setOnClickListener {
            val Intent = Intent(this, MainActivity4::class.java)
            startActivity(Intent)
        }

        btn3.setOnClickListener {
            val Intent = Intent(this, MainActivity5::class.java)
            startActivity(Intent)
        }
    }
}