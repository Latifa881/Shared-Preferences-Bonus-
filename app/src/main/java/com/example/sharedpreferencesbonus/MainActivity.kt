package com.example.sharedpreferencesbonus

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etIntent:EditText
    lateinit var etShared:EditText
    lateinit var btIntent:Button
    lateinit var btShared:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etIntent=findViewById(R.id.etIntent)
        etShared=findViewById(R.id.etShared)
        btIntent=findViewById(R.id.btIntent)
        btShared=findViewById(R.id.btShared)

        btIntent.setOnClickListener{
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("IntentData", etIntent.text.toString())
            etIntent.setText("")
            startActivity(intent)

        }
        btShared.setOnClickListener {
           var sharedPreferences= this.getSharedPreferences("TextView", Context.MODE_PRIVATE)
                    // We can save data with the following code
                    with(sharedPreferences.edit()) {
                        putString("Data",etShared.text.toString() )
                        apply()
                    }



        }



    }
}