package com.example.siger;

import com.example.siger.model.Kampus;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IInterface {
    @GET("Kampus.json")
    Call<List<Kampus>> getAllData();


}
