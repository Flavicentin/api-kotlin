package br.com.fiap.checkpoint.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {

        private lateinit var INSTANCE: Retrofit

        private fun getRetrofitInstance() : Retrofit {
            val http = OkHttpClient.Builder()
            if (!::INSTANCE.isInitialized){
                INSTANCE = Retrofit.Builder()
                    .baseUrl("https://servicodados.ibge.gov.br/api/")
                    .client(http.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return INSTANCE
        }

        fun createPostService(): IBGEService{
            return getRetrofitInstance().create(IBGEService::class.java)
        }
    }
}