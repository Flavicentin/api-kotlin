package br.com.fiap.checkpoint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class StartDestination : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start_destination, container, false)

        view.findViewById<Button>(R.id.countryButton).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.start_to_finish)
        }

        return view
    }
}