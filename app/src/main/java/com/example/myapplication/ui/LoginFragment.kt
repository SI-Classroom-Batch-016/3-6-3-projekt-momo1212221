package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.activityViewModels
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private val viewModel: SharedViewModel by activityViewModels()

    private lateinit var binding: FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            val name: String = binding.nameInput.toString()
            val pw: Int = binding.passwordInput.toString().toInt()
            viewModel.createUser(name,pw)



        }
    }
}
