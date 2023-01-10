package com.codecool.logic;

import com.codecool.model.Animal;
import com.codecool.model.Geese;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalFarm {
    List<Animal> animalList = new ArrayList<>();

    public void addAnimalToFarm(Animal animal) {
        animalList.add(animal);
    }
    public List<String> interactWithAnimals() {
        List<String> listOfNoises = new ArrayList<>();
        animalList.forEach(animal->listOfNoises.add(animal.makeNoise()));
        return listOfNoises;
    }
    public Geese findTheGoldenGoose() {
        return animalList.stream()
                .filter(g->g instanceof Geese)
                .map(Geese.class::cast) //.map(g->(Geese)g)
                .max(Comparator.comparing(Geese::numberOfEggs))
                .orElseThrow();
    }
}
