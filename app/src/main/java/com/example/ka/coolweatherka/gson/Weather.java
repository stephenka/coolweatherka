package com.example.ka.coolweatherka.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ka on 2017/5/5.
 */

public class Weather {
    public String status;//ok?
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
