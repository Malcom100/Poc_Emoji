package adneom.poc_emoji.common

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gtshilombowanticale on 27-06-17.
 */

@Module
class ApplicationModule(private val application : Application) {

    @Singleton
    @Provides
    fun providesConext() : Context {
        return application
    }


}