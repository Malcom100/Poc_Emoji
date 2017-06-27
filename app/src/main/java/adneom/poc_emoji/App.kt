package adneom.poc_emoji

import adneom.poc_emoji.common.ApplicationComponent
import adneom.poc_emoji.common.ApplicationModule
import adneom.poc_emoji.common.DaggerApplicationComponent
import android.app.Application

/**
 * Created by gtshilombowanticale on 27-06-17.
 */

class App : Application() {

    companion object {
        @JvmStatic lateinit var appComponent : ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
    }
}