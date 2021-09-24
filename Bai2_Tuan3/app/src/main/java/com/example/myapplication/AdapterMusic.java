package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMusic extends RecyclerView.Adapter<AdapterMusic.MusicViewHolder> {

    private ArrayList<Music> arrMusic;

    public AdapterMusic(ArrayList<Music> arrMusic) {
        this.arrMusic = arrMusic;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcv_music,parent,false);
        MusicViewHolder music = new MusicViewHolder(view);
        return  music;
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        Music musics = arrMusic.get(position);
        holder.img.setImageResource(musics.getImgae());
        holder.txtName.setText(musics.getName());
        holder.txtSinger.setText(musics.getSinger());
    }

    @Override
    public int getItemCount() {
        return arrMusic.size();
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView txtName, txtSinger;
        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img_singer);
            txtName = itemView.findViewById(R.id.txtName);
            txtSinger = itemView.findViewById(R.id.txtSinger);
        }
    }
}
