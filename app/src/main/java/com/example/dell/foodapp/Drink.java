package com.example.dell.foodapp;

public class Drink {

    private  String name;
    private  String description;
    private int imageId;
    public static final Drink[] ourDrink={
            new Drink("Cola", "Slices with cheese,cooked in the forn and added some sold and salat ",R.drawable.cocacola),
            new Drink("Orange", "burger of cow meat with maionezz,its very tesst and good to your health",R.drawable.orange),
            new Drink("Tea", "whole wheat sandwitch",R.drawable.tea),
            new Drink("limonada", "koftaa with salat",R.drawable.lemonada)

    };

    public Drink(String name, String description,int imageId) {
        this.name=name;
        this.description=description;
        this.imageId=imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return
                name
                ;
    }
}