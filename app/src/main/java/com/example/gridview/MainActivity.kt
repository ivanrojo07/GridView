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

        var frutas = ArrayList<String>()
        frutas.add("Durazno")
        frutas.add("Manzana")
        frutas.add("Platano")
        frutas.add("Sandia")

        var grid:GridView = findViewById(R.id.grid)
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frutas)
        grid.adapter = adapter
        grid.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, frutas.get(i), Toast.LENGTH_SHORT).show()
        }

    }
}