package uk.co.zac_h.daggermvvmjetpack.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import uk.co.zac_h.daggermvvmjetpack.R
import uk.co.zac_h.daggermvvmjetpack.data.LaunchModel
import uk.co.zac_h.daggermvvmjetpack.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var binding: MainFragmentBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    val name = MutableLiveData<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val launchObserver = Observer<LaunchModel> {
            println(it)
            //binding.message.text = it.missionName
            binding.launch?.name?.postValue(it.missionName)
        }

        viewModel.launch.observe(this, launchObserver)
    }

}