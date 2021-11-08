package com.example.foodnowdemo;

import java.util.ArrayList;

public class Food {
    String name;
    int image;
    int price;

    public Food(String name, int image, int price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public static ArrayList<Food> getMockData() {
        String[] names = {"Apple", "Audicar", "BmwCar", "Canon", "Debian", "Dribble", "Intel", "Ruby", "SpaceX", "Tesla", "TeslaCar", "Uber", "Vinfast"};
        int[] images = {R.drawable.apple, R.drawable.audicar, R.drawable.bmwcar, R.drawable.canon, R.drawable.debian, R.drawable.dribble, R.drawable.intel, R.drawable.ruby, R.drawable.spacex, R.drawable.tesla, R.drawable.teslacar, R.drawable.uber, R.drawable.vinfast};
        int[] prices = {1000, 100000, 150000, 500, 300, 200, 400, 150, 1000000, 1500000, 200000, 50, 50000};
        ArrayList<Food> foods = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            foods.add(new Food(names[i], images[i], prices[i]));
        }
        return foods;
    }
}

