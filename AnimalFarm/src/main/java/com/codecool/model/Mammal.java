package com.codecool.model;

public abstract class Mammal extends Animal {


    public Mammal(int weight) {
        super(weight);
    }

    protected void giveBirth(int babyWeight){
        this.weight -= babyWeight;
    }

    @Override
    public abstract String makeNoise();
}
