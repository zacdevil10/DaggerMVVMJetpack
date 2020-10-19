package uk.co.zac_h.daggermvvmjetpack.data

import com.squareup.moshi.Json

data class LaunchModel(
    @field:Json(name = "flight_number") var flightNumber: Int,
    @field:Json(name = "mission_name") var missionName: String
)