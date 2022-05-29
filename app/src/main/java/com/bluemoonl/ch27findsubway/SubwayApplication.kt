package com.bluemoonl.ch27findsubway
import android.app.Application
import com.bluemoonl.ch27findsubway.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class SubwayApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@SubwayApplication)
            modules(appModule)
        }
    }
}