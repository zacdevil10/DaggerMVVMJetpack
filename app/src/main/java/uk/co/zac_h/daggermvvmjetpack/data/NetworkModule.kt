package uk.co.zac_h.daggermvvmjetpack.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class NetworkModule {

    fun create(): SpaceXInterface = Retrofit.Builder().apply {
        baseUrl("https://api.spacexdata.com/v3/")
        addConverterFactory(MoshiConverterFactory.create())
    }.build().create(SpaceXInterface::class.java)

}