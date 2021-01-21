package com.example.siger;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    private static retrofit2.Retrofit retrofit;
    private static final String BASE_URL="https://apikampus.000webhostapp.com/API/";

    public static retrofit2.Retrofit getRetrofitInstance() {
        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
