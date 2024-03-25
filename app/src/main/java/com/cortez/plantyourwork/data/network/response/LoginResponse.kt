package com.cortez.plantyourwork.data.network.response

import com.cortez.plantyourwork.data.model.User
import com.google.gson.annotations.SerializedName


data class LoginRequest (
    @SerializedName("username") val username: String,
    @SerializedName("password") val password: String,
)

data class LoginResponse (
    @SerializedName("access_token") val token: String,
)

