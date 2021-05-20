package com.example.mobiledeveloptest.model

data class Url(
    val fullyHighlighted: Boolean,
    val matchLevel: String,
    val matchedWords: List<String>,
    val value: String
)