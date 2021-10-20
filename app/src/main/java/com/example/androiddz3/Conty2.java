package com.example.androiddz3;

import android.widget.ImageView;
import android.widget.TextView;

public class Conty2 {
    private int imageView;
    private String strana;
    private String gorod;

    public Conty2(int imageView, String strana, String gorod) {
        this.imageView = imageView;
        this.strana = strana;
        this.gorod = gorod;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getStrana() {
        return strana;
    }

    public void setStrana(String strana) {
        this.strana = strana;
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }
}
