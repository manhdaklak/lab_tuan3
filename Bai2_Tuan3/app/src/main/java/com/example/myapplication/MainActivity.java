package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcv_music;
    private ArrayList<Music> arrMusic;
    private AdapterMusic adt;
    private  RecyclerView.LayoutManager mLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_music = findViewById(R.id.rcv);
        arrMusic = new ArrayList<>();

        arrMusic.add(new Music("Love Story","Taylor Swift", R.drawable.eclipse));
        arrMusic.add(new Music("Love Story","Taylor Swift", R.drawable.eclipse));
        arrMusic.add(new Music("Love Story","Taylor Swift", R.drawable.eclipse));
        arrMusic.add(new Music("Love Story","Taylor Swift", R.drawable.eclipse));

        adt = new AdapterMusic((arrMusic));
        mLayout = new GridLayoutManager(this,1);
        rcv_music.setAdapter(adt);
        rcv_music.setLayoutManager(mLayout);
    }
}