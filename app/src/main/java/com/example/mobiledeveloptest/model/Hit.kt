package com.example.mobiledeveloptest.model

import java.util.*

data class Hit(
    val created_at: Date,
    val title: String,
    val url: Any,
    val author: String,
    val points: Any,
    val story_text: Any,
    val comment_text: String,
    val num_comments: Any,
    val story_id: Int,
    val story_title: String,
    val story_url: String,
    val parent_id: Int,
    val created_at_i: Int,
    val _tags: List<String>,
    val objectID: String,
    val _highlightResult: HighlightResult,

)