package com.example.mobiledeveloptest.`interface`

import com.example.mobiledeveloptest.model.Hit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface RetrofitService {
    @GET ("?query=")
    fun getNewsList(
        @Query("created_at") created_at: Date?,
        @Query("title") title: String?,
        @Query("author") author: String
    ): Call<MutableList<Hit>>

}