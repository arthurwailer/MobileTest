package com.example.mobiledeveloptest

import android.os.Bundle
import android.util.Log

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobiledeveloptest.`interface`.RetrofitService
import com.example.mobiledeveloptest.adapter.MyNewsAdapter
import com.example.mobiledeveloptest.common.Common
import com.example.mobiledeveloptest.model.News
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var mService : RetrofitService
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter : MyNewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initRecycler()

        mService= Common.retrofitService
        rvNoticias.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        rvNoticias.layoutManager = layoutManager

        //dialog = SpotsDialog.Builder().setCancelable(false).setContext(this).build()

        getAllNewsList()
    }

    private fun getAllNewsList() {
        mService.getMovieList().enqueue(object : retrofit2.Callback<MutableList<News>> {
            override fun onResponse(
                call: Call<MutableList<News>>,
                response: Response<MutableList<News>>) {
                /*adapter = MyNewsAdapter(baseContext, response.body() as MutableList<News>)
                adapter.notifyDataSetChanged()
                rvNoticias.adapter = adapter*/
                //Log.println(1,response.body().toString(),"hola")
                Toast.makeText(this@MainActivity, "succes", Toast.LENGTH_LONG).show()
                Log.i(this@MainActivity.toString(),response.body().toString())

            }

            override fun onFailure(call: Call<MutableList<News>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "error", Toast.LENGTH_LONG).show()
            }


        })
    }
  /*  private fun initRecycler(){
       rvNoticias.layoutManager = LinearLayoutManager(this)
       val adapter = MyNewsAdapter(baseContext, mutableListOf(noticias))
       adapter.notifyDataSetChanged()
       rvNoticias.adapter = adapter
   }*/


}