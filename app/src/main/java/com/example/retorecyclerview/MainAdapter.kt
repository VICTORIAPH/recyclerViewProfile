package com.example.retorecyclerview

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retorecyclerview.databinding.ActivityMainBinding
import com.example.retorecyclerview.databinding.ItmPersonBinding
import org.json.JSONObject

class MainAdapter(private val profile: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding =  ItmPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  MainHolder(binding)
}

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(profile[position])
    }

    override fun getItemCount(): Int = profile.size

    class MainHolder(val binding: ItmPersonBinding): RecyclerView.ViewHolder(binding.root){
       fun render(profile: JSONObject){
           binding.tvName.setText(profile.getString("name"))
           binding.tvMutualfriends.setText(profile.getString("mutual"))
           binding.ivPerson.setImageResource(R.drawable.person_placeholder)
           binding.ivProfile.setImageResource(R.drawable.person_placeholder)

       }
    }
}