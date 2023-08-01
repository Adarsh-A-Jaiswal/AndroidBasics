package com.rishabhsoft.androidbasics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rishabhsoft.androidbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /**
     *  Defining view binding variable to access UI component Easily.
     */
    private lateinit var mainActivityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    }
}