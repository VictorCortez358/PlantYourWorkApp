package com.cortez.plantyourwork.ui.login.fragments.loginForm

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.cortez.plantyourwork.R
import com.cortez.plantyourwork.databinding.FragmentLoginFormBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFormFragment : Fragment() {

    private var _binding: FragmentLoginFormBinding? =null
    private val binding get() = _binding!!

    private val loginFormViewModel by viewModels<LoginFormViewModel>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        navigateToRegister()
        initLogin()
    }

    private fun initLogin() {

        binding.loginButton.setOnClickListener {
            val username = binding.inputUsernameLayout.editText?.text.toString()
            val password = binding.inputPasswordLayout.editText?.text.toString()
            loginFormViewModel.login(username, password)
        }
    }

    private fun navigateToRegister() {
        binding.registerButtonLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFormFragment_to_registerFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginFormBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}