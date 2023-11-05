package br.com.fiap.checkpoint.api

import retrofit2.Call
import retrofit2.http.GET

interface IBGEService {

    @GET("v1/paises/todos")
    fun getCountries() : Call<List<CountryModel>>

}