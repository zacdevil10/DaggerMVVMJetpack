package uk.co.zac_h.daggermvvmjetpack.data

import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) {

    suspend fun getLaunch() = remoteDataSource.getNextLaunch()

}
