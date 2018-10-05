package com.example.mikki.myrxjava;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    //https://api.themoviedb.org/3/movie/550?api_key=4623a60bf823493b0fd93995ea6c5161
    final static String BASE_URL = "https://api.themoviedb.org/3/movie/";

    static Retrofit retrofit;

    //addConverterFactory -- factory to convert your json data into class object
    public static Retrofit getRetrofit() {

        if(retrofit == null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
