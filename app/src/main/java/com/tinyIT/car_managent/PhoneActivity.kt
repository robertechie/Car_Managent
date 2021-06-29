package com.tinyIT.car_managent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhoneActivity : AppCompatActivity() {
    private lateinit var btnOpen: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)
        btnOpen = findViewById(R.id.open)
        btnOpen.setOnClickListener {
                var  i: Intent = Intent(Intent.ACTION_DIAL)
                startActivity(i)

        }
    }
}