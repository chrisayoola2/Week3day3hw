package com.example.week3day3hw;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Async extends AsyncTask<String, String, String> {
    AsyncCallback asyncCallback;

    public Async(AsyncCallback asyncCallback) {
        this.asyncCallback = asyncCallback;
    }

    @Override
    protected String doInBackground(String... strings) {
        int[] numbers = new int[1000];
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            numbers[i] = rand.nextInt(1000);
            strings[0] = String.valueOf(numbers[i]);
            publishProgress(strings);
        }
        Arrays.sort(numbers);

        String ret = "";
        for(int i =0;  i <numbers.length; i++){
            ret += String.valueOf(numbers[i]);
            ret += " ";
        }

        return ret;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        Log.d("TAG", "onProgressUpdate: " + values[0]);

    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        asyncCallback.returnString(s);
    }

    interface AsyncCallback {
        void returnString(String string);
    }

}

