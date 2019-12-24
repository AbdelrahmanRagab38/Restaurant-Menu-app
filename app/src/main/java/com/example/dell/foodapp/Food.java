package com.example.dell.foodapp;

public class Food {

    private  String name;
    private  String description;
    private int imageId;
    public static final Food[] ourFood={
           new Food("pizaa", "Slices with cheese,cooked in the forn and added some sold and salat ",R.drawable.pizaa),
            new Food("burger", "burger of cow meat with maionezz,its very tesst and good to your health",R.drawable.burger),
            new Food("Sandwitch", "whole wheat sandwitch",R.drawable.sandwich),
            new Food("Koftaa", "koftaa with salat",R.drawable.grillkofta)

    };

    public Food(String name, String description,int imageId) {
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
