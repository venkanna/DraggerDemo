package com.venkanna.daggerdemo;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Venkanna on 8/3/16.
 */
@Module(
        injects = {
                BaseApp.class,
                MainActivity.class,
        },
        includes = {
                AppModule.class,
                NetworkModule.class
        }
)

public class RootModule {

    private BaseApp app;

    public RootModule(BaseApp app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return app;
    }


}
