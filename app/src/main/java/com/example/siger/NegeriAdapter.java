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
import com.example.siger.model.Negri;

import java.util.List;

public class NegeriAdapter extends RecyclerView.Adapter<NegeriAdapter.NegeriViewHolder> {

    private Context context;
    private List<Negri> negeriList;

    public NegeriAdapter(Context context, List<Negri> negeriList) {
        this.context = context;
        this.negeriList = negeriList;
    }

    @NonNull
    @Override
    public NegeriViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_kampus, parent, false);


        return new NegeriViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NegeriViewHolder holder, final int position) {
        holder.namaNegeri.setText(negeriList.get(position).getNama());
        Glide.with(context).load(negeriList.get(position).getImageUrl()).into(holder.gambarNegeri);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("image", negeriList.get(position).getImageUrl());
                i.putExtra("nama", negeriList.get(position).getNama());
                i.putExtra("deskripsi", negeriList.get(position).getDeskripsi());
                i.putExtra("akreditas", negeriList.get(position).getAkreditasi());
                i.putExtra("biaya", negeriList.get(position).getBiaya());
                i.putExtra("dosen", negeriList.get(position).getJumlahdosen());
                i.putExtra("siswa", negeriList.get(position).getJumlahsiswa());
                i.putExtra("website", negeriList.get(position).getWebsite());
                i.putExtra("email", negeriList.get(position).getEmail());
                i.putExtra("telpon", negeriList.get(position).getTelpon());
                i.putExtra("fakultas", negeriList.get(position).getFakultas());
                i.putExtra("alamat", negeriList.get(position).getAlamat());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return negeriList.size();
    }

    public static class NegeriViewHolder extends RecyclerView.ViewHolder{


        ImageView gambarNegeri;
        TextView namaNegeri;

        public NegeriViewHolder(@NonNull View itemView){
            super((itemView));
            gambarNegeri = itemView.findViewById(R.id.item_img);
            namaNegeri = itemView.findViewById(R.id.nama_item);

        }
    }



}
