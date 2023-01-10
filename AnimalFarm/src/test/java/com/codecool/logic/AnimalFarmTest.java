package com.codecool.logic;

import com.codecool.model.Cat;
import com.codecool.model.Dog;
import com.codecool.model.DogBreeds;
import com.codecool.model.Geese;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalFarmTest {
AnimalFarm animalFarm = new AnimalFarm();
Cat cat1 = new Cat(40);
Dog dog1 = new Dog(60, DogBreeds.HUSKY);
Geese geese1 = new Geese(5);
Geese geese2 = new Geese(6);
@Test
    void makeNoiseTest() {
    animalFarm.addAnimalToFarm(cat1);
    animalFarm.addAnimalToFarm(dog1);
    assertEquals(List.of("Meow", "Woof"),animalFarm.interactWithAnimals());
}

@Test
    void checkGoldenGeese() {
    geese1.layEggs();
    geese1.layEggs();
    geese2.layEggs();
    animalFarm.addAnimalToFarm(geese1);
    animalFarm.addAnimalToFarm(geese2);
    assertEquals(geese1, animalFarm.findTheGoldenGoose());
}
}