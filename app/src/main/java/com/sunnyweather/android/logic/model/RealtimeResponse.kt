package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName
//后台json数据格式
//{
//    "status":"ok"
//    "result":{
//        "realtime:":{
//            "teamperature":23.16
//            "skycon" :"WIDN"
//            "air_quality" :{
//                "aqi":{"chn" :17.0}
//             }
//        }
//    }
//}
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)
    data class Realtime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQulity: AirQuality
    )

    data class AirQuality(val aqi: AQI)
    data class AQI(val chn: Float)
}