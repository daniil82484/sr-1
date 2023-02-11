package com.mob5.sr_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val poster_res:RecyclerView = findViewById(R.id.recyclerView)
        poster_res.adapter = Poster_adapter(this, PosterList().list)

        val poster_res2:RecyclerView = findViewById(R.id.recyclerView2)
        poster_res2.adapter = Poster_adapter2(this, PosterList2().list)
    }
}