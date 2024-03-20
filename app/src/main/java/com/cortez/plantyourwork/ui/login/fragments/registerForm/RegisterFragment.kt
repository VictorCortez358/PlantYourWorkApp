package com.cortez.plantyourwork.ui.login.fragments.registerForm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.cortez.plantyourwork.R
import com.cortez.plantyourwork.databinding.FragmentLoginFormBinding
import com.cortez.plantyourwork.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        navigateToLogin()
    }

    private fun navigateToLogin() {
        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFormFragment)
        }

        binding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFormFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}