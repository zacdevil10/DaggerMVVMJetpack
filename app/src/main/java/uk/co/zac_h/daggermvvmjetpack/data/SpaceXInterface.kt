package uk.co.zac_h.daggermvvmjetpack.data

import androidx.lifecycle.LiveData
import retrofit2.http.GET

interface SpaceXInterface {

    @GET("launches/next")
    suspend fun getNextLaunch(): LaunchModel

}