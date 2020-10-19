package uk.co.zac_h.daggermvvmjetpack.data

class Repository {

    private val retrofit = NetworkModule().create()

    suspend fun getLaunch() = retrofit.getNextLaunch()

}
