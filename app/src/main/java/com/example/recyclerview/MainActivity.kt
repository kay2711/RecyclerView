package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.FruitAdapter
import com.example.recyclerview.model.Fruit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.recycler_view)
       // recyclerView.layoutManager=GridLayoutManager(this,2)

        //recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val fruitList=ArrayList<Fruit>()
        fruitList.add(Fruit("Apple",R.drawable.apple))
        fruitList.add(Fruit("Banana",R.drawable.banana))
        fruitList.add(Fruit("Grape",R.drawable.grape))
        fruitList.add(Fruit("Strawberry",R.drawable.strawberry))
        fruitList.add(Fruit("Pineapple",R.drawable.pineapple))

        val fruitAdapter=FruitAdapter(fruitList)

        recyclerView.adapter=fruitAdapter
    }
}
