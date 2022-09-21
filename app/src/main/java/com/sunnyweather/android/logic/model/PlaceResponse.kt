package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

//json字段和Kotlin命名规范不太一致，使用SerializedName注解方式，来让json字段与Kotlin字段之间建立映射
data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class PlaceResponse(val status: String,val places: List<Place>)

data class Location(val lng: String, val lat: String)