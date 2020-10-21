package uk.co.zac_h.daggermvvmjetpack

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import uk.co.zac_h.daggermvvmjetpack.ui.main.MainFragment

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}