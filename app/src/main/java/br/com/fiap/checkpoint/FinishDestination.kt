package br.com.fiap.checkpoint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.checkpoint.api.ApiAdapter
import br.com.fiap.checkpoint.api.CountryModel
import br.com.fiap.checkpoint.api.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FinishDestination : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_finish_destination, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.CountryRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        lateinit var adapter: ApiAdapter

        val service = RetrofitClient.createPostService()
        val call: Call<List<CountryModel>> = service.getCountries()

        call.enqueue(object : Callback<List<CountryModel>>{
            override fun onResponse(call: Call<List<CountryModel>>, response: Response<List<CountryModel>>) {
                var data = response.body()!!
                adapter = ApiAdapter(context!!, data)
                recyclerView.adapter = adapter
            }

            override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {
                val s = "Ocorreu um erro para consultar os paises"
            }
        })
        return view
    }


}