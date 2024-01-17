package com.example.cal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickListener()
    }
    public fun clickListener(){
        val cvsun
        cvsun.setOnClickListener{
            
        }
    }
}