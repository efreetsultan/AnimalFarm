package com.codecool.model;
// I think you chose the correct one. This is better as an abstract class. The default implementation for an interface would only work with static values
public abstract class Mammal extends Animal {

    public Mammal(int weight) {
        super(weight);
    }

    // TODO i dont think this has to be protected because we want to call this method from outside
    protected void giveBirth(int babyWeight){
        this.weight -= babyWeight;
    }

    // This is good like this. It's not code duplication, because you have different implementations for all the animals
    @Override
    public abstract String makeNoise();
}
