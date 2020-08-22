package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas = ArrayList<Fruta>()
        frutas.add(Fruta("Durazno",R.drawable.durazno))
        frutas.add(Fruta("Manzana",R.drawable.manzana))
        frutas.add(Fruta("Platano",R.drawable.platano))
        frutas.add(Fruta("Sandia",R.drawable.sandia))

        var grid:GridView = findViewById(R.id.grid)
//        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frutas)
        val adapter = AdaptadorCustom(this,frutas)
        grid.adapter = adapter
        grid.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, frutas.get(i).nombre, Toast.LENGTH_SHORT).show()
        }

    }
}