package com.codecool.model;

public class Geese extends Animal{
    int numberOfEggsLayed = 0;

    public Geese(int weight) {
        super(weight);
    }

    @Override
    public String makeNoise() {
        return "Honk";
    }

    public void layEggs() {
        numberOfEggsLayed++;
    }

    public int  numberOfEggs() {
        return numberOfEggsLayed;
    }
}
