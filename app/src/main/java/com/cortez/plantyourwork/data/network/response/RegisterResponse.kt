package com.cortez.plantyourwork.data.network.response

import com.google.gson.annotations.SerializedName

data class RegisterResponse(
    @SerializedName("name") val name: String,
    @SerializedName("username") val user: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
)