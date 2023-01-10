package com.codecool.model;

// TODO Cat should extend Mammal
public class Cow extends Animal{
    public Cow(int weight) {
        super(weight);
    }

    // TODO "Moo" could also be considered as a magic number. I suggest extracting it to a constant. Same goes for the other noises
    @Override
    public String makeNoise() {
        return "Moo";
    }
}
