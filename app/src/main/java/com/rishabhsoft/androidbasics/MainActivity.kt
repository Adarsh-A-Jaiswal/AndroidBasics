package com.rishabhsoft.androidbasics

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.rishabhsoft.androidbasics.databinding.ActivityMainBinding
import com.rishabhsoft.androidbasics.location.LocationActivity

class MainActivity : AppCompatActivity() {

    /**
     *  Defining view binding variable to access UI component Easily.
     */
    private lateinit var mainActivityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            ),
            0
        )
        /**
         *  Initializing binding variable with layout
         */
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)

        /**
         *  Click Listener for next button.
         */
        mainActivityBinding.btnActivities.setOnClickListener {
            /**
             *  Stating first activity through intent
             */
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }


        mainActivityBinding.btnServices.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
        }
    }
}