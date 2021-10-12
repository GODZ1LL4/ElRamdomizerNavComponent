package com.example.elramdomizernavcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.elramdomizernavcomponent.R
import com.example.elramdomizernavcomponent.databinding.FragmentDiceBinding
import kotlin.random.Random


class DiceFragment : Fragment() {

    lateinit var binding: FragmentDiceBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDiceBinding.inflate(inflater, container, false)

        binding.btnLanzarDado.setOnClickListener {
            tirarDado()
        }
        return binding.root
    }

    private fun tirarDado() {
        val randomNum = Random.nextInt(6) + 1

        val drawableImg = when (randomNum) {
            1 -> R.drawable.alea_1
            2 -> R.drawable.alea_2
            3 -> R.drawable.alea_3
            4 -> R.drawable.alea_4
            5 -> R.drawable.alea_5
            else -> R.drawable.alea_6
        }

        binding.dadoImg.setImageResource(drawableImg)
    }
}