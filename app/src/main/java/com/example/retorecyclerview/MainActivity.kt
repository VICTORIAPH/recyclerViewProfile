package com.example.retorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retorecyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"name\": \"An awesome person name\", \"name\": \"Carol Daenerys  Perez\", \"mutual\": \"8 mutual friends\"}"),
            JSONObject("{\"name\": \"John Lara\", \"mutual\": \"2 mutual friends\"}"),
            JSONObject("{\"name\": \"Jonathan Medina\", \"mutual\": \"9 mutual friends\"}"),
            JSONObject("{\"name\": \"Raul Perez\", \"mutual\": \"12 mutual friends\"}")
        )
        binding.rvPerson.adapter = MainAdapter(fakeVideoData)
    }
}