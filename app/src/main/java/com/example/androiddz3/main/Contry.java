package com.example.androiddz3.main;

public class Contry {
    private int imageView;
    private String country;
    private String town;
    private int im;
    private String continentName;
    private int id;

    public Contry(String continentName,int im,int id) {
        this.im = im;
        this.continentName = continentName;
        this.id = id;
    }
    public Contry(int imageView, String country, String town) {
        this.imageView = imageView;
        this.country = country;
        this.town = town;
    }

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
