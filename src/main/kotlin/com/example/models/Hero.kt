package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Hero(
    val id: Int,
    val name: String,
    val img: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val family: List<String>,
    val ability: List<String>,
    val natureType: List<String>
)