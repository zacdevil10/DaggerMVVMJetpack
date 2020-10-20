package uk.co.zac_h.daggermvvmjetpack.data.remote

import uk.co.zac_h.daggermvvmjetpack.data.rest.HttpService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val service: HttpService
) {

    suspend fun getNextLaunch() = service.getNextLaunch()

}