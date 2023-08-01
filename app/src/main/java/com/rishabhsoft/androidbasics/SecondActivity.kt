package com.rishabhsoft.androidbasics

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.rishabhsoft.androidbasics.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    /**
     *  Defining binding variable to access UI component Easily.
     */
    private lateinit var binding: ActivitySecondBinding

    // Initializing ActivityResultLauncher to launch
    private val launcher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            //Handling result which is coming third Activity
            if (result.resultCode == RESULT_OK) {
                finish()
            }
        }

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
             *  Stating third activity through start Activity for result intent
             */
            var intent = Intent(this, ThirdActivity::class.java)
            launcher.launch(intent)
        }
    }
}