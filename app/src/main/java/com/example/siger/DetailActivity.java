package com.example.siger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.siger.R;

public class DetailActivity extends AppCompatActivity {

    ImageView imageUrlView;
    TextView Nama, Des, Akre, Biaya, Dosen, Siswa, Web, Email, Telpon, Fakultas, Alamat;


    String imageUrl, nama, des, akre, biaya, dosen, siswa, web, email, telpon, fakultas, alamat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        imageUrl = intent.getStringExtra("image");
        nama = intent.getStringExtra("nama");
        des = intent.getStringExtra("deskripsi");
        akre = intent.getStringExtra("akreditas");
        biaya = intent.getStringExtra("biaya");
        dosen = intent.getStringExtra("dosen");
        siswa = intent.getStringExtra("siswa");
        web = intent.getStringExtra("website");
        email = intent.getStringExtra("email");
        telpon = intent.getStringExtra("telpon");
        fakultas = intent.getStringExtra("fakultas");
        alamat = intent.getStringExtra("alamat");


        imageUrlView = findViewById(R.id.detail_gambar);
        Nama = findViewById(R.id.nama);
        Des = findViewById(R.id.deskripsi);
        Akre = findViewById(R.id.akreditas);
        Biaya = findViewById(R.id.biaya);
        Dosen = findViewById(R.id.dosen);
        Siswa = findViewById(R.id.siswa);
        Web= findViewById(R.id.website);
        Email= findViewById(R.id.email);
        Telpon = findViewById(R.id.telpon);
        Fakultas = findViewById(R.id.fakultas);
        Alamat = findViewById(R.id.alamat);

        Glide.with(getApplicationContext()).load(imageUrl).into(imageUrlView);
        Nama.setText(nama);
        Des.setText(des);
        Akre.setText(akre);
        Biaya.setText(biaya);
        Dosen.setText(dosen);
        Siswa.setText(siswa);
        Web.setText(web);
        Email.setText(email);
        Telpon.setText(telpon);
        Fakultas.setText(fakultas);
        Alamat.setText(alamat);
    }


}