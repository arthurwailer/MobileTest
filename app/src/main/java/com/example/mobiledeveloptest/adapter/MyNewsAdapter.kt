package com.example.mobiledeveloptest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobiledeveloptest.R
import com.example.mobiledeveloptest.model.Hit

import kotlinx.android.synthetic.main.item_noticias.view.*

class MyNewsAdapter(private val context: Context, private val newsList: MutableList<Hit>): RecyclerView.Adapter<MyNewsAdapter.MyNewsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyNewsHolder{
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_noticias, parent, false)
        return MyNewsHolder(itemView)
    }

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: MyNewsAdapter.MyNewsHolder, position: Int) {
        holder.render(newsList[position])
    }

    class MyNewsHolder(private val view: View):RecyclerView.ViewHolder(view) {

        fun render(noticias: Hit) {
            view.tvAuthorNoticia.text = noticias.author.toString()
            //view.tvCreated_at.text = noticias.created_at.toString()
            //view.tvTitleNoticia.text = noticias.title as CharSequence?
        }

    }
}