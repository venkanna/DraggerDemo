package com.venkanna.daggerdemo;

import android.app.Application;

import dagger.ObjectGraph;

/**
 * Created by Venkanna on 8/3/16.
 */
public class BaseApp extends Application implements Injector{

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        injectDependencies();
    }

    private void injectDependencies() {
        objectGraph = ObjectGraph.create(new RootModule(this));
        objectGraph.inject(this);
    }

    @Override
    public void inject(Object object) {
        objectGraph.inject(object);
    }

}
