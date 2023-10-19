package com.example.sabrina_hm33_3m;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesViewHolder> {
    private ArrayList<String> moviesNameList;

    public MoviesAdapter(ArrayList<String> moviesNameList) {
        this.moviesNameList = moviesNameList;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MoviesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movies, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {

        holder.OnBind(moviesNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return moviesNameList.size();
    }
}
