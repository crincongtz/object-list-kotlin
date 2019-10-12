package com.example.listaobjetos.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listaobjetos.R
import com.example.listaobjetos.models.Person
import com.example.listaobjetos.models.Persona
import kotlinx.android.synthetic.main.row_option.view.*

class PersonListAdapter(personList: List<Persona>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var adapterPersonList: List<Persona> = emptyList()

    init {
        adapterPersonList = personList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_option, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val persona = adapterPersonList[position]
        val viewHolder = holder as PersonViewHolder
        viewHolder.bind(persona)
    }

    override fun getItemCount(): Int = adapterPersonList.size

    inner class PersonViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {

        fun bind(persona: Persona) {
            itemView.text_name.text = persona.name
            itemView.text_email.text = persona.email
            itemView.image_view.setImageResource(persona.image)
        }
    }

}