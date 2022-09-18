package com.example.gsontojson.lesson

import com.google.gson.annotations.SerializedName

data class SampleModel (

    @SerializedName("count")
    val count:Int,

    @SerializedName ("country")
    val country:String,

    @SerializedName("list")
    val list:List<String>
)