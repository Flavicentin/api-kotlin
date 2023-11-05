package br.com.fiap.checkpoint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.checkpoint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
    }
}