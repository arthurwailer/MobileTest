package com.example.mobiledeveloptest


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.developertest.Noticias
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val noticias:List<Noticias> = listOf(
        Noticias("03/02/21","el unicornio blanco","pedro navaja",),
        Noticias("04/02/21","el mause volador","Juan Pablo",),
        Noticias("05/02/21","electrolisis","Pedro Piedra"),
        Noticias("06/02/21","la bala que doblo a la esquina","Samuel Sunade"),
        Noticias("07/02/21","la 4 puntas de la mesa redonda","Asesino ninja"),
        Noticias("08/02/21","el incendio debajo del mar","Michael Jackson")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

   fun initRecycler(){
       rvNoticias.layoutManager = LinearLayoutManager(this)
       val adapter = NoticiasAdapter(noticias)
       rvNoticias.adapter = adapter


   }
}