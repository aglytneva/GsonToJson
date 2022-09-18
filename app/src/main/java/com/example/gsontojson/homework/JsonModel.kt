package com.example.gsontojson.homework

import com.google.gson.annotations.SerializedName

data class JsonModel<T>(
    @SerializedName("id")
    val id:String,

    @SerializedName("email")
    val email:String,

    @SerializedName("roles")
    val roles:List<String>?,

    @SerializedName("apiKey")
    val apiKey:List<String>,

    @SerializedName("profile")
     val profile: ProfileModel<Any?>,

    @SerializedName("username")
    val username:String?,

    @SerializedName("createdAt")
    val createdAt:String?,

    @SerializedName("updatedAt")
    val updatedAt:String?,

    )