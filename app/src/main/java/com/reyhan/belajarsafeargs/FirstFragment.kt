package com.reyhan.belajarsafeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val safeArgs: FirstFragmentArgs by navArgs()
        val ff = safeArgs.safeArgsNum

        return when (ff) {
            2 -> inflater.inflate(R.layout.fragment_two, container, false)
            else -> inflater.inflate(R.layout.fragment_first, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_second).setOnClickListener{
            findNavController().navigate(R.id.next_action)
        }
    }

}