package com.friend.rxjavaretrofitrecyclerview;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    static Retrofit retrofit;
    static Gson gson;

    public static  Retrofit getClient(){

        if(retrofit==null){

            if(gson==null){
                gson=new GsonBuilder().setLenient().create();
            }
            retrofit= new Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl(BASE_URL)
                    .build();
        }
        return retrofit;
    }
}































