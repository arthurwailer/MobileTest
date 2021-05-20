package com.example.mobiledeveloptest

import android.os.Bundle


import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobiledeveloptest.`interface`.RetrofitService
import com.example.mobiledeveloptest.adapter.MyNewsAdapter
import com.example.mobiledeveloptest.common.Common
import com.example.mobiledeveloptest.model.Hit
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call

import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private lateinit var mService: RetrofitService
    private lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: MyNewsAdapter
    var Tag = "hola que tal"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initRecycler()

        mService = Common.retrofitService
        rvNoticias.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        rvNoticias.layoutManager = layoutManager
        getAllNewsList()

        //dialog = SpotsDialog.Builder().setCancelable(false).setContext(this).build()
    }


    private fun getAllNewsList() {
        mService.getNewsList(null,null.toString(), null.toString()).enqueue(object : retrofit2.Callback<MutableList<Hit>> {
            override fun onResponse(
                call: Call<MutableList<Hit>>,
                response: Response<MutableList<Hit>>
            ) {
                if (response.isSuccessful) {
                    Toast.makeText(baseContext, "succes", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(baseContext, response.body().toString(), Toast.LENGTH_SHORT).show()

                }

            }

            override fun onFailure(call: retrofit2.Call<MutableList<Hit>>, t: Throwable) {
                Toast.makeText(baseContext, "error2", Toast.LENGTH_SHORT).show()
            }


        })
    }

    }





/*  private fun initRecycler(){
     rvNoticias.layoutManager = LinearLayoutManager(this)
     val adapter = MyNewsAdapter(baseContext, mutableListOf(noticias))
     adapter.notifyDataSetChanged()
     rvNoticias.adapter = adapter
 }*/


