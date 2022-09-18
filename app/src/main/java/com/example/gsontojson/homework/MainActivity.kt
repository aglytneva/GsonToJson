package com.example.gsontojson.homework

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.gsontojson.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()

        val arrayTutorialType = object : TypeToken<Map<String,Any>>() {}.type
        var result: Map<String, Any> = gson.fromJson(response, arrayTutorialType )
        Log.e("LOG =>", result.toString())


//        Вариант 1
//        val result= gson.fromJson(response.trim(), JsonModel::class.java )

//        Вариант 2
//        val arrayTutorialType = object : TypeToken<JsonModel<ProfileModel<LocationModel>>>() {}.type
//        var result: JsonModel<ProfileModel<LocationModel>> = gson.fromJson(response, arrayTutorialType )


    }
}

