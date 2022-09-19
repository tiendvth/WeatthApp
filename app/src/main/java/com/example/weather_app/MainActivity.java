package com.example.weather_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;

import javax.security.auth.callback.Callback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWeather();
    }

    private void getWeather() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIManager.SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIManager service = retrofit.create(APIManager.class);
        service.getItemData().enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Weather u = response.body();
                Log.d("getTemp", u.getMain().getTemp());
            }
            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                Log.d("MainActivity", "onFailure: "+t);
            }
        });
    }
}