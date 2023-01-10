package com.codecool.model;

public class Cat extends Mammal{

    public Cat(int weight) {
        super(weight);
    }

    @Override
    public String makeNoise() {
        return "Meow";
    }
}
