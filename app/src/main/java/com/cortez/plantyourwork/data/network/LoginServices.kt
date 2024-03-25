package com.cortez.plantyourwork.data.network

import com.cortez.plantyourwork.data.network.response.LoginRequest
import com.cortez.plantyourwork.data.network.response.LoginResponse
import javax.inject.Inject

class LoginServices @Inject constructor(private val apiRoutes: ApiRoutes) {
    suspend fun login(username: String, password: String): LoginResponse {
        return apiRoutes.login(LoginRequest(username, password))
    }
}