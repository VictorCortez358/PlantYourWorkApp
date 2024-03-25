package com.cortez.plantyourwork.ui.login.fragments.loginForm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cortez.plantyourwork.data.model.Login
import com.cortez.plantyourwork.data.network.response.LoginRequest
import com.cortez.plantyourwork.data.network.response.LoginResponse
import com.cortez.plantyourwork.domain.PostLoginUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginFormViewModel @Inject constructor(
    private val postLoginUser: PostLoginUser,
) : ViewModel() {

    private val _token = MutableLiveData<String>()
    val token: LiveData<String> = _token

    fun login(username: String, password: String) {
        viewModelScope.launch {
            val response = postLoginUser(username, password)
            _token.value = response.token
            Log.i("LoginFormViewModel", "Token: ${response.token}")
        }
    }

}
