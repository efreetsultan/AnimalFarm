package com.codecool.model;

public class Geese extends Animal{
    // TODO same thing about initializing all values in the constructor
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

    // TODO "getNumberOfEggs" because this is a getter for the field, also because method names should start with a verb
    public int  numberOfEggs() {
        return numberOfEggsLayed;
    }
}
