package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Fruit
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.layout_fruit.view.*
import java.util.ArrayList

class FruitAdapter(val fruitsList:ArrayList<Fruit>):RecyclerView.Adapter<FruitViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_fruit,parent,false)
        return FruitViewHolder(view)
    }

    override fun getItemCount(): Int {
       return fruitsList.size
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.fruitName.text=fruitsList[position].name
        holder.fruitImage.setImageResource(fruitsList[position].image)
    }
}
class FruitViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val fruitName=itemView.findViewById<TextView>(R.id.txt_name)
    val fruitImage=itemView.findViewById<ImageView>(R.id.fruit_image)
}

