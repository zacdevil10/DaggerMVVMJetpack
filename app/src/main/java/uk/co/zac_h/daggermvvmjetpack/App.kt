package uk.co.zac_h.daggermvvmjetpack

import android.app.Application
import uk.co.zac_h.daggermvvmjetpack.di.ApplicationComponent
import uk.co.zac_h.daggermvvmjetpack.di.DaggerApplicationComponent

class App: Application() {

    val appComponent: ApplicationComponent = DaggerApplicationComponent.create()

}