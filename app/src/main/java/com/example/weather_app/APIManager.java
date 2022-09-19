package com.example.weather_app;

import android.telecom.Call;

public interface APIManager {
    String SERVER_URL = "https://api.openweathermap.org/";

    Call<Weather> getItemData();
    Weather build();
}