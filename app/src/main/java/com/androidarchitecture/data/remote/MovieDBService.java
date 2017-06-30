package com.androidarchitecture.data.remote;

import com.androidarchitecture.data.remote.model.MoviesResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieDBService {

    @GET("movie/popular")
    Call<MoviesResponse> loadMovies();

}
