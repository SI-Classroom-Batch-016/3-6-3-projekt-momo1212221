package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.example.myapplication.ItemAdapter
import com.example.myapplication.data.DataSource
import com.example.myapplication.databinding.FragmentHomeBuchBinding


class HomeBuchFragment : Fragment() {
    private lateinit var binding: FragmentHomeBuchBinding
    private val viewModel: SharedViewModel by activityViewModels()
    private  val args:HomeBuchFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBuchBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //notitzen erstellen
        val data = DataSource.data
        val adapter = ItemAdapter(data)
        binding.notizenRV.adapter = adapter
        binding.nameTV.text = args.name


    }
}

