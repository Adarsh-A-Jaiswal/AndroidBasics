package com.rishabhsoft.androidbasics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rishabhsoft.androidbasics.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    /**
     *  Defining binding variable to access UI component Easily.
     */
    private lateinit var firstActivityBinding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         *  Initializing binding variable with layout
         */
        firstActivityBinding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(firstActivityBinding.root)

        /**
         *  Click Listener for back button.
         */
        firstActivityBinding.btnBack.setOnClickListener {
            /**
             *  Finishing this first activity on click of back button.
             */
            this.finish()
        }

        /**
         *  Click Listener for next button.
         */
        firstActivityBinding.btnNext.setOnClickListener {
            /**
             *  Stating second activity through intent
             */
            val secondActivityIntent = Intent(this,SecondActivity::class.java)
            startActivity(secondActivityIntent)
        }
    }
}