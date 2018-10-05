package com.example.mikki.myrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mikki.myrxjava.model.TheMovieDb;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class RetrofitActivity extends AppCompatActivity {

    private static final String TAG = "testRetrofit";
    ApiRetrofit apiRetrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);


        apiRetrofit = RetrofitInstance.getRetrofit().create(ApiRetrofit.class);

        String apiKey = "4623a60bf823493b0fd93995ea6c5161";
        /*Call<TheMovieDb> theMovieDbCall = apiRetrofit.getMovieDb(apiKey);

        theMovieDbCall.enqueue(new Callback<TheMovieDb>() {
            @Override
            public void onResponse(Call<TheMovieDb> call, Response<TheMovieDb> response) {
                Log.d(TAG, "onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<TheMovieDb> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage().toString());
            }
        });*/

        Observable<TheMovieDb> theMovieDbObservable = apiRetrofit.getMovieDb(apiKey);


        theMovieDbObservable
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<TheMovieDb>() {

                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d(TAG, "onSubscribe: " + d.toString());
                    }

                    @Override
                    public void onNext(TheMovieDb theMovieDb) {
                        Log.d(TAG, "onNext: " + theMovieDb.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage().toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete: ");
                    }
                });



    }
}
