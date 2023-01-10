package com.codecool.model;

import java.util.UUID;

public abstract class Animal {
    protected int weight;
    protected UUID id;

    protected Animal(int weight) {
        this.weight = weight;
        this.id = UUID.randomUUID();
    }

    public abstract String makeNoise();
}
