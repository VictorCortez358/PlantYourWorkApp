package com.cortez.plantyourwork.data.network

import com.cortez.plantyourwork.data.model.User
import com.cortez.plantyourwork.data.network.response.LoginRequest
import com.cortez.plantyourwork.data.network.response.LoginResponse
import com.cortez.plantyourwork.data.network.response.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiRoutes {
    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse

    @POST("auth/register")
    suspend fun register(@Body registerRequest: User): RegisterResponse
}