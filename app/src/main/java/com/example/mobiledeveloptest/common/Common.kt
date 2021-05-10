package com.example.mobiledeveloptest.common

import com.example.mobiledeveloptest.`interface`.RetrofitService
import com.example.mobiledeveloptest.retrofit.RetrofitClient

object Common {
    private const val BASE_URL = "https://hn.algolia.com/api/v1/search_by_date/"

    val retrofitService: RetrofitService
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}
