package com.example.route

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val name: String,
    val age: String,
    val pic: String? =null
)
