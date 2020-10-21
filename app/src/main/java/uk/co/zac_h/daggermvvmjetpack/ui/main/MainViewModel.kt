package uk.co.zac_h.daggermvvmjetpack.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import uk.co.zac_h.daggermvvmjetpack.data.Repository
import uk.co.zac_h.daggermvvmjetpack.data.model.LaunchModel
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    val showContent = MutableLiveData(false)

    val launch: LiveData<LaunchModel> = liveData {
        _loading.postValue(true)
        emit(repository.getLaunch())
        _loading.postValue(false)
    }

    fun toggleVisibility() {
        showContent.value?.let {
            showContent.postValue(!it)
        } ?: showContent.postValue(false)
    }

}