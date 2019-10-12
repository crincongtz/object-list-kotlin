package com.example.listaobjetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listaobjetos.adapters.PersonListAdapter
import com.example.listaobjetos.models.Person
import com.example.listaobjetos.models.Persona
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listaDePersonas = listOf<Persona>(
        Persona("Falcon", "falcon@avenger.com", R.drawable.falcon),
        Persona("Capitan America", "c.america@avenger.com", R.drawable.capitan_america),
        Persona("Hulk", "hulk@avenger.com", R.drawable.hulk),
        Persona("Ironman", "ironman@avenger.com", R.drawable.ironman),
        Persona("Black widow", "b.widow@avenger.com", R.drawable.black_widow),
        Persona("Spiderman", "spiderman@avenger.com", R.drawable.spiderman)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view_list.layoutManager = LinearLayoutManager(this)
        recycler_view_list.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
        recycler_view_list.adapter = PersonListAdapter(listaDePersonas)
    }
}
