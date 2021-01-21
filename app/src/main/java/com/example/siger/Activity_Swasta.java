package com.example.siger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;


import com.example.siger.model.Kampus;
import com.example.siger.model.Swasta;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Swasta extends AppCompatActivity {

    IInterface apiInterface;

    RecyclerView swastaRecyclerView;

    SwastaAdapter swastaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__swasta);

        apiInterface = Retrofit.getRetrofitInstance().create(IInterface.class);
        Call<List<Kampus>> call = apiInterface.getAllData();
        call.enqueue(new Callback<List<Kampus>>() {
            @Override
            public void onResponse(Call<List<Kampus>> call, Response<List<Kampus>> response) {

                List<Kampus> ListKampusList = response.body();

                getSwastaData(ListKampusList.get(0).getSwasta());

            }

            @Override
            public void onFailure(Call<List<Kampus>> call, Throwable t) {

                Toast.makeText(Activity_Swasta.this,"Server is not responding.", Toast.LENGTH_SHORT).show();

            }
        });

    }


    private void getSwastaData(List<Swasta> swastaList){

        swastaRecyclerView = findViewById(R.id.rv_swasta);
        swastaAdapter = new SwastaAdapter(this, swastaList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        swastaRecyclerView.setLayoutManager(layoutManager);
        swastaRecyclerView.setAdapter(swastaAdapter);


    }
}