package com.example.mobiledeveloptest.model

data class Title(
    val fullyHighlighted: Boolean,
    val matchLevel: String,
    val matchedWords: List<String>,
    val value: String
)