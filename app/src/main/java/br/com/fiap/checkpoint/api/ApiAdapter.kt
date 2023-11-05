package br.com.fiap.checkpoint.api

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.checkpoint.R

class ApiAdapter(var c: Context, var list: List<CountryModel>): RecyclerView.Adapter<ApiAdapter.ViewHolder>() {

    inner class ViewHolder( v : View) : RecyclerView.ViewHolder(v){
        var txtCountryName = v.findViewById<TextView>(R.id.countryName)
        var txtcountryLocate = v.findViewById<TextView>(R.id.countryLocate)
        var txtcountryCapital = v.findViewById<TextView>(R.id.countryCapital)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(c).inflate(R.layout.country_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtCountryName.text = list[position].nome.abreviado
        holder.txtcountryLocate.text = list[position].localizacao.regiao.nome
        holder.txtcountryCapital.text = list[position].governo.capital.nome
    }

}