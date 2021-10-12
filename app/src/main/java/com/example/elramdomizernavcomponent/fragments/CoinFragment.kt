package com.example.elramdomizernavcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.elramdomizernavcomponent.R
import com.example.elramdomizernavcomponent.databinding.FragmentCoinBinding


class CoinFragment : Fragment() {

    lateinit var binding: FragmentCoinBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCoinBinding.inflate(inflater, container, false)

        binding.btnLanzarMoneda.setOnClickListener {
            lanzarMoneda()
        }
        return binding.root
    }

    private fun lanzarMoneda() {
        val randomNum = kotlin.random.Random.nextInt(2) + 1

        val drawableLado = when (randomNum) {
            1 -> R.drawable.face
            else -> R.drawable.cross
        }

        binding.monedaImg.setImageResource(drawableLado)
    }
}