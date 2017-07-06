package com.androidarchitecture.data.local;

/**
 * Created by Peter on 05.07.2017.
 */

/** Working only with data and transformations between different implementations of Entities of ORMs*/
public class FilmWrapper {

    private Film filmEntity;

    public FilmWrapper(Film filmEntity) {
        this.filmEntity = filmEntity;
    }

    public int getId() {
        return filmEntity.getId();
    }

    public void setId(int id) {
        this.filmEntity.setId(id);
    }

    public String getPosterPath() {
        return filmEntity.getPosterPath();
    }

    public void setPosterPath(String posterPath) {
        this.filmEntity.setPosterPath(posterPath);
    }

    public boolean isAdult() {
        return filmEntity.isAdult();
    }

    public void setAdult(boolean adult) {
        this.filmEntity.setAdult(adult);
    }

    public String getOverview() {
        return filmEntity.getOverview();
    }

    public void setOverview(String overview) {
        this.filmEntity.setOverview(overview);
    }

    public String getOriginalTitle() {
        return filmEntity.getOriginalTitle();
    }

    public void setOriginalTitle(String originalTitle) {
        this.filmEntity.setOriginalTitle(originalTitle);
    }

    public String getTitle() {
        return filmEntity.getTitle();
    }

    public void setTitle(String title) {
        this.filmEntity.setTitle(title);
    }

    public int getVoteCount() {
        return filmEntity.getVoteCount();
    }

    public void setVoteCount(int voteCount) {
        this.filmEntity.setVoteCount(voteCount);
    }

    public double getVoteAverage() {
        return filmEntity.getVoteAverage();
    }

    public void setVoteAverage(double voteAverage) {
        this.filmEntity.setVoteAverage(voteAverage);
    }

    public String getBackdropPath() {
        return filmEntity.getBackdropPath();
    }

    public void setBackdropPath(String backdropPath) {
        this.filmEntity.setBackdropPath(backdropPath);
    }

    public String getOriginalLanguage() {
        return filmEntity.getOriginalLanguage();
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.filmEntity.setOriginalLanguage(originalLanguage);
    }
}
