package uk.co.zac_h.daggermvvmjetpack.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import uk.co.zac_h.daggermvvmjetpack.databinding.MainFragmentBinding
import javax.inject.Inject

class MainFragment : DaggerFragment() {

    private var binding: MainFragmentBinding? = null

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            viewModel = mainViewModel
            lifecycleOwner = this@MainFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}