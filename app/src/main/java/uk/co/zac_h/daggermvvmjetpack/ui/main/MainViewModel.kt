package uk.co.zac_h.daggermvvmjetpack.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import uk.co.zac_h.daggermvvmjetpack.data.LaunchModel
import uk.co.zac_h.daggermvvmjetpack.data.Repository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    val launch: LiveData<LaunchModel> = liveData {
        loading.postValue(true)
        emit(repository.getLaunch())
        loading.postValue(false)
    }

    val loading = MutableLiveData<Boolean>()

}