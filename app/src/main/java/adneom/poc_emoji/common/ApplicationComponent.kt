package adneom.poc_emoji.common

import dagger.Component
import javax.inject.Singleton

/**
 * Created by gtshilombowanticale on 27-06-17.
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent : BaseComponent {

}