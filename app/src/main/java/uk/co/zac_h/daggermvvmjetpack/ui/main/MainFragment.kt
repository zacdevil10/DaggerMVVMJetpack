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
import uk.co.zac_h.daggermvvmjetpack.App
import uk.co.zac_h.daggermvvmjetpack.R
import uk.co.zac_h.daggermvvmjetpack.data.LaunchModel
import uk.co.zac_h.daggermvvmjetpack.databinding.MainFragmentBinding
import javax.inject.Inject

class MainFragment : Fragment() {

    private lateinit var binding: MainFragmentBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject lateinit var viewModel: MainViewModel

    lateinit var launch: LaunchModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (context?.applicationContext as App).appComponent.inject(this)

        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this

        val launchObserver = Observer<LaunchModel> {
            println(it)
            //binding.message.text = it.missionName
            launch = it
        }

        viewModel.launch.observe(this, launchObserver)
    }

}