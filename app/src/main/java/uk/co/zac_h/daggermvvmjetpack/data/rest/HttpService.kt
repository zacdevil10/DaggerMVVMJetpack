package uk.co.zac_h.daggermvvmjetpack.data.rest

import retrofit2.http.GET
import uk.co.zac_h.daggermvvmjetpack.data.model.LaunchModel

interface HttpService {

    @GET("launches/50")
    suspend fun getNextLaunch(): LaunchModel

}