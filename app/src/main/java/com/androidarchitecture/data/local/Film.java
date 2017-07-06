package com.androidarchitecture.data.local;

/**
 * Created by Peter on 06.07.2017.
 */

public abstract class Film {
    public abstract int getId();
    public abstract void setId(int id);
    public abstract String getPosterPath();
    public abstract void setPosterPath(String posterPath);
    public abstract boolean isAdult();
    public abstract void setAdult(boolean adult);
    public abstract String getOverview();
    public abstract void setOverview(String overview);
    public abstract String getOriginalTitle();
    public abstract void setOriginalTitle(String originalTitle);
    public abstract String getTitle();
    public abstract void setTitle(String title);
    public abstract int getVoteCount();
    public abstract void setVoteCount(int voteCount);
    public abstract double getVoteAverage();
    public abstract void setVoteAverage(double voteAverage);
    public abstract String getBackdropPath();
    public abstract void setBackdropPath(String backdropPath);
    public abstract String getOriginalLanguage();
    public abstract void setOriginalLanguage(String originalLanguage);
}
