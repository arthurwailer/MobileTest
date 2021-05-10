package com.example.mobiledeveloptest


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobiledeveloptest.adapter.MyNewsAdapter
import com.example.mobiledeveloptest.model.News
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val noticias:News = (
            News("salta","peo", "Estas")
            )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

   private fun initRecycler(){
       rvNoticias.layoutManager = LinearLayoutManager(this)
       val adapter = MyNewsAdapter(baseContext, mutableListOf(noticias))
       adapter.notifyDataSetChanged()
       rvNoticias.adapter = adapter


   }
}