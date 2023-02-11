package com.mob5.sr_1

data class Poster(val imageId: Int, val title: String)

class PosterList{
    val list = arrayListOf(
        Poster(R.drawable.poster1, "Рисунок \n 1"),
        Poster(R.drawable.poster2, "Рисунок \n 2"),
        Poster(R.drawable.poster3, "Рисунок \n 3"),
        Poster(R.drawable.poster4, "Рисунок \n 4"),
        Poster(R.drawable.poster5, "Рисунок \n 5"),
        Poster(R.drawable.poster6, "Рисунок \n 6"),
    )
}