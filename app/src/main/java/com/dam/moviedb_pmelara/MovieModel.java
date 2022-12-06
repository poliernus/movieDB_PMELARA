package com.dam.moviedb_pmelara;

public class MovieModel {

    String title;
    String image;
    String date;
    String popularityValue;

    public MovieModel(String title, String image, String date, String popularityValue) {
        this.title = title;
        this.image = image;
        this.date = date;
        this.popularityValue = popularityValue;
    }

    public MovieModel() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPopularityValue() {
        return popularityValue;
    }

    public void setPopularityValue(String popularityValue) {
        this.popularityValue = popularityValue;
    }
}
