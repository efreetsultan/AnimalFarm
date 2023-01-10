package com.codecool.model;

public class Cow extends Animal{
    public Cow(int weight) {
        super(weight);
    }

    @Override
    public String makeNoise() {
        return "Moo";
    }
}
