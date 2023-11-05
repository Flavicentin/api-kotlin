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
import br.com.fiap.checkpoint.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FinishDestination : Fragment() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_finish_destination, container, false)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val recyclerView = view.findViewById<RecyclerView>(R.id.CountryRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        lateinit var adapter: ApiAdapter

        val service = RetrofitClient.createPostService()
        val call: Call<List<CountryModel>> = service.getCountries()

        call.enqueue(object : Callback<List<CountryModel>>{
            override fun onResponse(call: Call<List<CountryModel>>, response: Response<List<CountryModel>>) {
                view?.let {
                    Snackbar.make(it, "Consulta com sucesso", Snackbar.LENGTH_SHORT).show()
                }

                var data = response.body()!!
                adapter = ApiAdapter(context!!, data)
                recyclerView.adapter = adapter
            }

            override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {
                view?.let {
                    Snackbar.make(it, "Ocorreu um erro ao buscar os países", Snackbar.LENGTH_SHORT).show()
                }
            }
        })
        return view
    }
}