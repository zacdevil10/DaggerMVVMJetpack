package uk.co.zac_h.daggermvvmjetpack.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import uk.co.zac_h.daggermvvmjetpack.App
import uk.co.zac_h.daggermvvmjetpack.data.rest.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, AndroidSupportInjectionModule::class, AndroidInjectModule::class])
interface ApplicationComponent : AndroidInjector<App> {

    override fun inject(app: App)

}