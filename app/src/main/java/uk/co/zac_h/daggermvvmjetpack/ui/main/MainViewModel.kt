package uk.co.zac_h.daggermvvmjetpack.ui.main

import androidx.lifecycle.*
import uk.co.zac_h.daggermvvmjetpack.data.model.LaunchModel
import uk.co.zac_h.daggermvvmjetpack.data.Repository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    val loading = MutableLiveData<Boolean>()
    val showHide = MutableLiveData<Boolean>().apply {
        postValue(false)
    }

    val launch: LiveData<LaunchModel> = liveData {
        loading.postValue(true)
        emit(repository.getLaunch())
        loading.postValue(false)
    }

    fun showHide() {
        showHide.value?.let {
            showHide.postValue(!it)
        } ?: showHide.postValue(false)
    }

}