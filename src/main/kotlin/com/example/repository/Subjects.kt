package com.example.repository


import kotlinx.serialization.Serializable





@Serializable
data class Subjects(
    val year: String,
    val subject: List<Questions>
)









