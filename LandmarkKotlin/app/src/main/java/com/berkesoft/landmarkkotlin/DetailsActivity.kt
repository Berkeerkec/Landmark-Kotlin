package com.berkesoft.landmarkkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.berkesoft.landmarkkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent

        val selectedIntent = intent.getSerializableExtra("landmark") as Landmark

        binding.imageView.setImageResource(selectedIntent.image)
        binding.nameText.text = selectedIntent.name
        binding.countryText.text = selectedIntent.country








    }
}