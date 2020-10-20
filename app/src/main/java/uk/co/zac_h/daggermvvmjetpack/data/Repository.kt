package uk.co.zac_h.daggermvvmjetpack.data

import javax.inject.Inject

class Repository @Inject constructor() {

    private val retrofit = NetworkModule().providesRetrofitService()

    suspend fun getLaunch() = retrofit.getNextLaunch()

}
