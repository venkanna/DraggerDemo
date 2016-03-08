package com.venkanna.daggerdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

/**
 * Created by Venkanna on 8/3/16.
 */

@Module(
        complete = false,
        library = true
)
public class NetworkModule {

    @Provides
    @Singleton
    public RestService providesRestServices() {
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint("").build();
        return adapter.create(RestService.class);
        //return  new
    }

}
