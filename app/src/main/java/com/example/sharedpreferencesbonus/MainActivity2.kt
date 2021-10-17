package com.example.sharedpreferencesbonus

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tvIntent: TextView
    lateinit var tvShared: TextView
    lateinit var btShared: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvIntent = findViewById(R.id.tvIntent)
        tvShared = findViewById(R.id.tvShared)
        btShared = findViewById(R.id.btShared)

        tvIntent.setText(intent.getStringExtra("IntentData"))
        btShared.setOnClickListener {
            val sharedPreferences =
                this.getSharedPreferences("TextView", Context.MODE_PRIVATE)
            tvShared.setText( sharedPreferences.getString("Data",""))
        }

    }
}