package com.example.mikki.myrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;



public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "secTest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*//observable is source of data, doesn't need to loop, throw data continuously
        Observable<Integer> integerObservable = Observable.just(1,2,3,4,5).filter(new Func1<Integer, Boolean>() {
            @Override
            public Boolean call(Integer integer) {
                Log.d(TAG, "\ncall: " + integer);
                return (integer%2!=0);
            }
        });

        Observer<Integer> integerObserver = new Observer<Integer>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "finished catching all data will call onCompleted: ");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: "+e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "I hear you, you are integer:  "+integer);
            }
        };



        //schedulers.io() -- schedule the data
        //androidSchedulers --
        //executorSchedulers --
        Subscription subscription = integerObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(integerObserver);*/



    }
}
