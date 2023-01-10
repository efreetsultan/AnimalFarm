package com.codecool.model;

// TODO Dog should extend Mammal
public class Dog extends Animal{
    DogBreeds breed;
    // TODO if you have a constructor then it's a better patterns to initialize all values there
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
        // TODO 10 is a magic number, i suggest extracting it into a constant (Ctrl Alt C for geekness!)
        if(holes>=10) {
            System.err.println("FU no more holes for you!");
        }
        else {
            holes++;
        }
    }
}
