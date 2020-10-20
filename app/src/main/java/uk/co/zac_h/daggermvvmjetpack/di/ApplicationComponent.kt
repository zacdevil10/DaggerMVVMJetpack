package uk.co.zac_h.daggermvvmjetpack.di

import dagger.Component
import uk.co.zac_h.daggermvvmjetpack.data.rest.NetworkModule
import uk.co.zac_h.daggermvvmjetpack.ui.main.MainFragment
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainFragment: MainFragment)
}