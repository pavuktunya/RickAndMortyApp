package com.example.rickandmortyapp.domain.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CharactersResponse(
    val info: Info,
    val results: List<CharacterResponse>
)

@Serializable
class Info(
    val count: Long,
    val pages: Long,
    val next: String?,
    val prev: String?
)

@Serializable
class CharacterResponse(
    val id: Long,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Origin,
    val location: Location,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String,
)

@Serializable
class Origin(
    val name: String,
    val url: String,
)

@Serializable
class Location(
    val name: String,
    val url: String,
)

//enum class CharacterStatus(val statusName: String) {
//    @SerializedName("Dead")
//    DEAD("Dead"),
//
//    @SerializedName("Alive")
//    ALIVE("Alive"),
//
//    @SerializedName("unknown")
//    UNKNOWN("Unknown"),
//}
