package com.codecool.model;

public class Dog extends Animal{
    DogBreeds breed;
    private int holes = 0;

    public Dog(int weight,DogBreeds breed) {
        super(weight);
        this.breed = breed;
    }


    @Override
    public String makeNoise() {
        return "Woof";
    }

    public void digHole() {
        if(holes>=10) {
            System.err.println("FU no more holes for you!");
        }
        else {
            holes++;
        }
    }
}
