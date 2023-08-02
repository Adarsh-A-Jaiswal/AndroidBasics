package com.rishabhsoft.androidbasics.location

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rishabhsoft.androidbasics.R
import com.rishabhsoft.androidbasics.databinding.ActivityLocationBinding

class LocationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLocationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // clickListener for start the service.
        binding.btnStartService.setOnClickListener {
            Intent(applicationContext,LocationService::class.java).apply {
                action = LocationService.ACTION_START
                startService(this)
            }


        }

        // clickListener for stop the service.
        binding.btnStopService.setOnClickListener {
            Intent(applicationContext,LocationService::class.java).apply {
                action = LocationService.ACTION_STOP
                startService(this)
            }
        }
    }

}