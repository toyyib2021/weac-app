package com.example.repository


import kotlinx.serialization.Serializable





@Serializable
data class Subjects(
    val id: Int,
    val subject: List<List<Questions>>
)









