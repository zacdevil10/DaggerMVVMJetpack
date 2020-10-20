package uk.co.zac_h.daggermvvmjetpack.data.remote

import uk.co.zac_h.daggermvvmjetpack.data.rest.SpaceXInterface
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val service: SpaceXInterface
) {

    suspend fun getNextLaunch() = service.getNextLaunch()

}