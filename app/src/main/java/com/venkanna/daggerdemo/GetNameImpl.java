package com.venkanna.daggerdemo;

import android.content.Context;

import retrofit.RestAdapter;

/**
 * Created by Venkanna on 8/3/16.
 */
public class GetNameImpl implements IGetName {

    GetNameImpl(Context context,RestService restService){

    }

    @Override
    public String getName(){
        return "Venky";
    }
}
