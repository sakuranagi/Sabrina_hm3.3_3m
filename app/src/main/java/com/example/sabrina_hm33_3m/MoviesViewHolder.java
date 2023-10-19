package com.example.sabrina_hm33_3m;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoviesViewHolder extends RecyclerView.ViewHolder {

private TextView tvMovesName;

    public MoviesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMovesName = itemView.findViewById(R.id.tv_movie_name);
    }

    public void OnBind(String moviesName){
        tvMovesName.setText(moviesName);
    }
}
