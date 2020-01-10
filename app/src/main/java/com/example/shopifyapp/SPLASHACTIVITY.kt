package com.example.shopifyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SPLASHACTIVITY : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashactivity)


        Handler().postDelayed ({
            //start activity
            startActivity(Intent( this@SPLASHACTIVITY, MainActivity::class.java))
            //finish this activity
            finish()
        },  4000)//4seconds



    }
}
