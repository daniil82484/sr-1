package com.mob5.sr_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Poster_adapter2(val con:Context, val list:ArrayList<Poster2>):RecyclerView.Adapter<Poster_adapter2.Link>() {
    class Link(itemView:View):RecyclerView.ViewHolder(itemView) {
        val img:ImageView = itemView.findViewById(R.id.image_poster)
        val title:TextView = itemView.findViewById(R.id.title_poster)
        val text:TextView = itemView.findViewById(R.id.text_poster)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.poster_item2, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Poster_adapter2.Link, position: Int) {
        holder.img.setImageResource(list[position].imageId)
        holder.title.setText(list[position].title)
        holder.text.setText(list[position].text)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}