package com.example.myapplication.data

import com.example.myapplication.data.model.Eintrag
import com.example.myapplication.data.model.User

object DataSource {
    val user = mutableListOf(
        User("Egon Kowalzki", 19)
    )

    var eintrag = listOf(
        Eintrag("ödlföaldgäödlfgrjgaoälagädflkgerigälkarägadfgadfg")
    )
}