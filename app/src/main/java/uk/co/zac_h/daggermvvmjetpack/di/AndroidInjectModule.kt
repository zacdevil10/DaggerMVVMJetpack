package uk.co.zac_h.daggermvvmjetpack.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import uk.co.zac_h.daggermvvmjetpack.MainActivity
import uk.co.zac_h.daggermvvmjetpack.ui.main.MainFragment

@Module
abstract class AndroidInjectModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment

}