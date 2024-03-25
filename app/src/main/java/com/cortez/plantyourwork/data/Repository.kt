package com.cortez.plantyourwork.data

import com.cortez.plantyourwork.data.network.LoginServices
import javax.inject.Inject

class Repository @Inject constructor(
    private val api: LoginServices
) {
    suspend fun postLoginUser(
        email: String,
        password: String
    ) = api.login(email, password)
}
