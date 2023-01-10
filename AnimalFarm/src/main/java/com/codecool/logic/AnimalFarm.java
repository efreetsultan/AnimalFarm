package com.codecool.logic;

import com.codecool.model.Animal;
import com.codecool.model.Geese;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalFarm {
    // TODO this List could be a different collection. I suggest Set because you don't need to store the order of the elements and probably don't want duplicates of the same animal instance either
    // TODO missing access modifier for animalList. It's a good practice to always add one and data hiding could be applied here
    List<Animal> animalList = new ArrayList<>();

    // TODO this class has a missing constructor and according to the Dependency Inversion principle from SOLID it could be a good idea to pass this list as a param from the outside
    public void addAnimalToFarm(Animal animal) {
        animalList.add(animal);
    }
    public List<String> interactWithAnimals() {
        List<String> listOfNoises = new ArrayList<>();
        animalList.forEach(animal->listOfNoises.add(animal.makeNoise()));
        return listOfNoises;
        // TODO you can use a stream and map these noises too
    }
    public Geese findTheGoldenGoose() {
        return animalList.stream()
                .filter(g->g instanceof Geese)
                .map(Geese.class::cast) //.map(g->(Geese)g)
                .max(Comparator.comparing(Geese::numberOfEggs))
                .orElseThrow();
    }
}
