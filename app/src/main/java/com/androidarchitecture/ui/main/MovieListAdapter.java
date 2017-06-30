package com.androidarchitecture.ui.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import com.androidarchitecture.data.local.entity.MovieEntity;
import com.androidarchitecture.databinding.ItemMovieListBinding;
import com.androidarchitecture.ui.BaseAdapter;

public class MovieListAdapter extends BaseAdapter<MovieListAdapter.MovieViewHolder, MovieEntity> {

    private List<MovieEntity> movieEntities;

    private final MovieListCallback movieListCallback;

    public MovieListAdapter(@NonNull MovieListCallback movieListCallback) {
        movieEntities = new ArrayList<>();
        this.movieListCallback = movieListCallback;
    }

    @Override
    public void setData(List<MovieEntity> movieEntities) {
        this.movieEntities = movieEntities;
        notifyDataSetChanged();
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return MovieViewHolder.create(LayoutInflater.from(viewGroup.getContext()), viewGroup, movieListCallback);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder viewHolder, int i) {
        viewHolder.onBind(movieEntities.get(i));
    }

    @Override
    public int getItemCount() {
        return movieEntities.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {

        public static MovieViewHolder create(LayoutInflater inflater, ViewGroup parent, MovieListCallback callback) {
            ItemMovieListBinding itemMovieListBinding = ItemMovieListBinding.inflate(inflater, parent, false);
            return new MovieViewHolder(itemMovieListBinding, callback);
        }

        ItemMovieListBinding binding;

        public MovieViewHolder(ItemMovieListBinding binding, MovieListCallback callback) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(v ->
                    callback.onMovieClicked(binding.getMovie(), binding.imageViewCover));
        }

        public void onBind(MovieEntity movieEntity) {
            binding.setMovie(movieEntity);
            binding.executePendingBindings();
        }
    }
}
