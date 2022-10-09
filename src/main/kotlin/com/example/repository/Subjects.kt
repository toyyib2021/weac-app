package com.example.repository


import kotlinx.serialization.Serializable


@Serializable
data class English(
    val year: String,
    val english: List<Questions>
)

@Serializable
data class Maths(
    val year: String,
    val maths: List<Questions>
)

@Serializable
data class Economics(
    val year: String,
    val economics: List<Questions>
)


@Serializable
data class CivicEdu(
    val year: String,
    val civic: List<Questions>
)


@Serializable
data class Biology(
    val year: String,
    val biology: List<Questions>
)


@Serializable
data class Commerce(
    val year: String,
    val commerce: List<Questions>
)

@Serializable
data class Account(
    val year: String,
    val account: List<Questions>
)


@Serializable
data class Physics(
    val year: String,
    val physics: List<Questions>
)

@Serializable
data class Agriculture(
    val year: String,
    val agriculture: List<Questions>
)

@Serializable
data class Literature(
    val year: String,
    val literature: List<Questions>
)


@Serializable
data class Chemistry(
    val year: String,
    val chemistry: List<Questions>
)

@Serializable
data class Government(
    val year: String,
    val government: List<Questions>
)

@Serializable
data class Marketing(
    val year: String,
    val marketing: List<Questions>
)









