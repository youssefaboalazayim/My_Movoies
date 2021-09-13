package com.example.mymovies.modle;

public class Movie {
     String title , genre , year  ;
     int image , id;



    public Movie(String title, String genre, String year , int id , int image ) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image = image;
        this.id = id;

    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

















}
