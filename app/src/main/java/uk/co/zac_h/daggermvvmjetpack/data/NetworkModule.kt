package uk.co.zac_h.daggermvvmjetpack.data

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class NetworkModule {

    @Provides
    fun providesRetrofitService(): SpaceXInterface = Retrofit.Builder().apply {
        baseUrl("https://api.spacexdata.com/v3/")
        addConverterFactory(MoshiConverterFactory.create())
    }.build().create(SpaceXInterface::class.java)

}