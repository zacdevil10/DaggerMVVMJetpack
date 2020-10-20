package uk.co.zac_h.daggermvvmjetpack.data.model

import com.squareup.moshi.Json

data class LaunchModel(
    @field:Json(name = "flight_number") var flightNumber: Int,
    @field:Json(name = "mission_name") var missionName: String,
    @field:Json(name = "links") var links: LaunchLinksModel
)

data class LaunchLinksModel(
    @field:Json(name = "mission_patch") var missionPatch: String?
)