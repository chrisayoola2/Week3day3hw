package com.example.week3day3hw;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class ExampleRunnable implements Runnable {

    private Handler mainHandler;

    public  ExampleRunnable(Handler mainHandler) {
        this.mainHandler = mainHandler;
    }

    @Override
    public void run() {

            double pie;
            pie = (((16.0)*(Math.atan((1.0/5.0))))-((4.0)*(Math.atan((1.0/239.0)))));

        Log.d("TAG", "HERE is " + pie);

       // Handler mainHandler = new Handler(Looper.getMainLooper());
       // mainHandler.post(new Runnable() {


    }

}
