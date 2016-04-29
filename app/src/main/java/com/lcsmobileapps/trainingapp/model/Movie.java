package com.lcsmobileapps.trainingapp.model;

/**
 * Created by Leandro on 4/28/2016.
 */
public class Movie {

    String Title;

    public Movie(String title, String year, String imdbID, String type, String poster, String plot) {
        Title = title;
        Year = year;
        this.imdbID = imdbID;
        Type = type;
        Poster = poster;
        setPlot(plot);
    }

    String Year;
    String imdbID;
    String Type;
    String Poster;
    String Plot;


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }
}
