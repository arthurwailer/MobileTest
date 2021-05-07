package com.example.mobiledeveloptest
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.developertest.Noticias
import kotlinx.android.synthetic.main.item_noticias.view.*



class NoticiasAdapter(val noticias:List<Noticias>):RecyclerView.Adapter<NoticiasAdapter.NoticiasHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiasHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NoticiasHolder(layoutInflater.inflate(R.layout.item_noticias,parent, false))

    }

    override fun onBindViewHolder(holder: NoticiasHolder, position: Int) {
        holder.render(noticias[position])

    }

    override fun getItemCount(): Int = noticias.size

    class NoticiasHolder(val view:View):RecyclerView.ViewHolder(view){

        fun render(noticias: Noticias) {
            view.tvAuthorNoticia.text = noticias.author
            view.tvCreated_at.text = noticias.created_at
            view.tvTitleNoticia.text = noticias.title
        }
    }

}