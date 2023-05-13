package com.labactivity.dishcoveryapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.dishcoveryapp.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {

    private lateinit var binding:ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.about.setOnClickListener() {
            gotoactivity(this, About::class.java, "about", "About")
        }
        binding.contact.setOnClickListener() {
            gotoactivity(this, About::class.java, "about2", "About2")
        }
    }
        fun gotoactivity(activity: Activity, classs: Class<*>, artist: String, nameOfSong: String) {
            val intent = Intent(activity, classs)
            intent.putExtra(artist, nameOfSong)
            startActivity(intent)
    }
}