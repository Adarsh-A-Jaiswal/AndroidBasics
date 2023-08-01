package com.rishabhsoft.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rishabhsoft.androidbasics.databinding.ActivityFirstBinding
import com.rishabhsoft.androidbasics.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    /**
     *  Defining binding variable to access UI component Easily.
     */
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         *  Initializing binding variable with layout
         */
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         *  Click Listener for back button.
         */
        binding.btnBack.setOnClickListener {
            /**
             *  Finishing this second activity on click of back button.
             */
            this.finish()
        }

        /**
         *  Click Listener for next button.
         */
        binding.btnNext.setOnClickListener {
            /**
             *  Stating third activity through intent
             */
            val secondActivityIntent = Intent(this,ThirdActivity::class.java)
            startActivity(secondActivityIntent)
        }
    }
}