package com.example.repository

import kotlinx.serialization.Serializable

@Serializable
data class Questions(
    val objective: Objective,
    val theory: Theory = Theory(
        "", "", "", "", "", "", )
)

@Serializable
data class Objective(
    val id: String,
    val instructions: String = "",
    val image: String = "",
    val essay: String ="",
    val question: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val answer: String,
    val questionUnderline: String = "",
    val questionEnd: String = "",
)

@Serializable
data class Theory(
    val id: String,
    val instructions: String = "",
    val image: String = "",
    val essay: String ="",
    val question: String,
    val answer: String,
)

