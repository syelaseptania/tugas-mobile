package com.example.siger;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.siger.model.Swasta;

import java.util.List;

public class SwastaAdapter extends RecyclerView.Adapter<SwastaAdapter.SwastaViewHolder> {

    private Context context;
    private List<Swasta> swastaList;

    public SwastaAdapter(Context context, List<Swasta> swastaList) {
        this.context = context;
        this.swastaList = swastaList;
    }

    @NonNull
    @Override
    public SwastaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_kampus, parent, false);


        return new SwastaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SwastaViewHolder holder, final int position) {
        holder.namaSwasta.setText(swastaList.get(position).getNama());
        Glide.with(context).load(swastaList.get(position).getImageUrl()).into(holder.gambarSwasta);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("image", swastaList.get(position).getImageUrl());
                i.putExtra("nama", swastaList.get(position).getNama());
                i.putExtra("deskripsi", swastaList.get(position).getDeskripsi());
                i.putExtra("akreditas", swastaList.get(position).getAkreditasi());
                i.putExtra("biaya", swastaList.get(position).getBiaya());
                i.putExtra("dosen", swastaList.get(position).getJumlahdosen());
                i.putExtra("siswa", swastaList.get(position).getJumlahsiswa());
                i.putExtra("website", swastaList.get(position).getWebsite());
                i.putExtra("email", swastaList.get(position).getEmail());
                i.putExtra("telpon", swastaList.get(position).getTelpon());
                i.putExtra("fakultas", swastaList.get(position).getFakultas());
                i.putExtra("alamat", swastaList.get(position).getAlamat());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return swastaList.size();
    }

    public static class SwastaViewHolder extends RecyclerView.ViewHolder{


        ImageView gambarSwasta;
        TextView namaSwasta;

        public SwastaViewHolder(@NonNull View itemView){
            super((itemView));
            gambarSwasta = itemView.findViewById(R.id.item_img);
            namaSwasta = itemView.findViewById(R.id.nama_item);

        }
    }



}
