package com.cortez.plantyourwork.data.model

import java.util.UUID

data class User(
    val id: UUID,
    val name: String,
    val username: String,
    val email: String,
    val password: String,
)
