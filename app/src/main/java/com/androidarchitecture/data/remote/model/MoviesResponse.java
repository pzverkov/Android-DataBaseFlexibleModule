package com.androidarchitecture.data.remote.model;


import java.util.List;

import com.androidarchitecture.data.local.entity.MovieEntity;

public class MoviesResponse {
    private List<MovieEntity> results;

    public List<MovieEntity> getResults() {
        return results;
    }

    public void setResults(List<MovieEntity> results) {
        this.results = results;
    }
}
