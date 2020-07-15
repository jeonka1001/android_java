package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayList<WeatherInfo> mWeatherInfo = new ArrayList<>();
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.weather_listView);

        mWeatherInfo.add(new WeatherInfo("Korea",7));
        mWeatherInfo.add(new WeatherInfo("America",15));
        mWeatherInfo.add(new WeatherInfo("England",24));
        mWeatherInfo.add(new WeatherInfo("Mexico",22));
        mWeatherInfo.add(new WeatherInfo("Canada",1));
        mWeatherInfo.add(new WeatherInfo("China",100));


        mListView.setAdapter(new WeatherAdapter(this,mWeatherInfo));
    }
}
