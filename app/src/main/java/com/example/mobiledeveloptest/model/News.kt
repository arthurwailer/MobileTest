package com.example.mobiledeveloptest.model

import com.google.gson.annotations.SerializedName

data class News(
  @SerializedName("title") val title: String? = null,
  @SerializedName("author") val author: String? = null,
  @SerializedName("created_at") val createdAt: String? = null


)