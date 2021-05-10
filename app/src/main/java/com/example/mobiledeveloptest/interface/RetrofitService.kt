package com.example.mobiledeveloptest.`interface`

import com.example.mobiledeveloptest.model.News
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    //  @GET ("?query=story_text")
    fun getMovieList(): Call<MutableList<News>>
}