package com.rishabhsoft.androidbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rishabhsoft.androidbasics.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    /**
     *  Defining binding variable to access UI component Easily.
     */
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         *  Initializing binding variable with layout
         */
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         *  Click Listener for back button.
         */
        binding.btnBack.setOnClickListener {
            /**
             *  Finishing this third activity on click of back button.
             */
            this.finish()
        }

        /**
         *  Click Listener for finish button.
         */
        binding.btnFinish.setOnClickListener {
            /**
             *  Finishing the whole task/stack which have same affinity.
             */
            this.finishAffinity()
        }
    }
}