package com.example.sabrina_hm33_3m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> moviesNameList = new ArrayList<>();
    private RecyclerView rvMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        moviesNameList.add("Move to Heaven");
        moviesNameList.add("Weak Hero Class");
        moviesNameList.add("Hospital Playlist");
        moviesNameList.add("Flower or Evil");
        moviesNameList.add("I'm not a Robot");
        moviesNameList.add("Alchemy of Soul");
        moviesNameList.add("Reply 1988");
        moviesNameList.add("Prison Playbook");
        moviesNameList.add("Mother");
        moviesNameList.add("Crash landing on you");
        moviesNameList.add("Vincenzo");
        moviesNameList.add("Signal");
        initAdapter();

    }

    private void initAdapter() {
        MoviesAdapter adapter = new MoviesAdapter(moviesNameList);
        rvMovies.setAdapter(adapter);
    }

    private void initView() {
        rvMovies = findViewById(R.id.rv_movies);
    }
}