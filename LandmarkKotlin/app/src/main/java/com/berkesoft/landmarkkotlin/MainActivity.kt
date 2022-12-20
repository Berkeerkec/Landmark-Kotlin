package com.berkesoft.landmarkkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.berkesoft.landmarkkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var landmarkArray : ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var landmarkArray = ArrayList<Landmark>()

        var pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        var eiffel = Landmark("Eiffel", "France", R.drawable.eiffel)
        var colessium = Landmark("Colessium", "Italy", R.drawable.colessium)
        var londonBridge = Landmark("London Bridge", "UK", R.drawable.londonbridge)

        landmarkArray.add(pisa)
        landmarkArray.add(eiffel)
        landmarkArray.add(colessium)
        landmarkArray.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(landmarkArray)
        binding.recyclerView.adapter = adapter






    }
}