package com.venkanna.daggerdemo;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Venkanna on 8/3/16.
 */
@Module(
        complete = false,
        library = true
)

public class AppModule {

    @Provides
    IGetName provideGetName(Context context,RestService restService){
        return new GetNameImpl(context,restService);
    }

}
