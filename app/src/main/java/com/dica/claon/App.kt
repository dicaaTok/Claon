package com.dica.claon

import android.app.Application
import com.dica.claon.di.appModule
import com.dica.claon.di.dataModule
import com.dica.claon.di.domainModule
import com.dica.claon.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class App: Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger(level = org.koin.core.logger.Level.INFO)
            modules(
                appModule,
                domainModule,
                dataModule,
                presentationModule,
            )
        }

    }
}