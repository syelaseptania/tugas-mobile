package com.example.siger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;


import com.example.siger.model.Kampus;
import com.example.siger.model.Negri;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Negeri extends AppCompatActivity {

    IInterface apiInterface;

    RecyclerView negeriRecyclerView;

    NegeriAdapter negeriAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__negeri);

        apiInterface = Retrofit.getRetrofitInstance().create(IInterface.class);
        Call<List<Kampus>> call = apiInterface.getAllData();
        call.enqueue(new Callback<List<Kampus>>() {
            @Override
            public void onResponse(Call<List<Kampus>> call, Response<List<Kampus>> response) {

                List<Kampus> ListKampusList = response.body();

                getNegeriData(ListKampusList.get(0).getNegri());

            }

            @Override
            public void onFailure(Call<List<Kampus>> call, Throwable t) {

                Toast.makeText(Activity_Negeri.this,"Server is not responding.", Toast.LENGTH_SHORT).show();

            }
        });

    }


    private void getNegeriData(List<Negri> negeriList){

        negeriRecyclerView = findViewById(R.id.rv_negeri);
        negeriAdapter = new NegeriAdapter(this, negeriList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        negeriRecyclerView.setLayoutManager(layoutManager);
        negeriRecyclerView.setAdapter(negeriAdapter);


    }
}