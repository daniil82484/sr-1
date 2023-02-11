package com.mob5.sr_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Poster_adapter(val con:Context, val list:ArrayList<Poster>):RecyclerView.Adapter<Poster_adapter.Link>() {
    class Link(itemView:View):RecyclerView.ViewHolder(itemView) {
        val img:ImageView = itemView.findViewById(R.id.image_poster)
        val title:TextView = itemView.findViewById(R.id.title_poster)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.poster_item, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Poster_adapter.Link, position: Int) {
        holder.img.setImageResource(list[position].imageId)
        holder.title.setText(list[position].title)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}