package com.example.mikki.myrxjava;

import com.example.mikki.myrxjava.model.TheMovieDb;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiRetrofit {
    //https://api.themoviedb.org/3/movie/550?api_key=4623a60bf823493b0fd93995ea6c5161
    @GET("550")
    //Call<TheMovieDb> getMovieDb(@Query("api_key") String apiKey);
    Observable<TheMovieDb> getMovieDb(@Query("api_key") String apiKey);
}
