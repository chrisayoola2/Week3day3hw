package com.example.week3day3hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Async.AsyncCallback {

    private Handler mainHandler = new Handler();
    public int [] myNumbers = new int[1000];
    TextView tvRandomGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       tvRandomGenerator = findViewById(R.id.tvRandomGenerator);


    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSort: //
                Async randomSorter = new Async(this);
                randomSorter.execute("AsyncTask");

            case R.id.btnRunnable:
                ExampleRunnable runnable = new ExampleRunnable(mainHandler);
                new Thread(runnable).start();
        }
    }

    @Override
    public void returnString(String string) {
        tvRandomGenerator.setText(string);
    }



}
