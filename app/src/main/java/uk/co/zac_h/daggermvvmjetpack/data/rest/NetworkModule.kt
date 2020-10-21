package uk.co.zac_h.daggermvvmjetpack.data.rest

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class NetworkModule {

    @Provides
    fun providesRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.spacexdata.com/v3/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    @Provides
    fun providesHttpService(retrofit: Retrofit): HttpService = retrofit.create(HttpService::class.java)

}