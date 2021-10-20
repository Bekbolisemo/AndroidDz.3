package com.example.androiddz3;

public class Contry {
    private int im;
    private String continentName;
    private int id;

    public Contry(String continentName,int im,int id) {
        this.im = im;
        this.continentName = continentName;
        this.id = id;
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
}
