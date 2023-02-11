package com.mob5.sr_1

data class Poster2(val imageId: Int, val title: String, val text: String)

class PosterList2{
    val list = arrayListOf(
        Poster2(R.drawable.poster11, "иконка", "1"),
        Poster2(R.drawable.poster22, "иконка", "2"),
        Poster2(R.drawable.poster33, "иконка", "3"),
        Poster2(R.drawable.poster44, "иконка", "4"),
    )
}