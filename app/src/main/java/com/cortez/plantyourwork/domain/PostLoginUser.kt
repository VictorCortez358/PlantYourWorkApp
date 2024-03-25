package com.cortez.plantyourwork.domain

import com.cortez.plantyourwork.data.Repository
import javax.inject.Inject

class PostLoginUser @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(
        email: String,
        password: String
    ) = repository.postLoginUser(email, password)
}