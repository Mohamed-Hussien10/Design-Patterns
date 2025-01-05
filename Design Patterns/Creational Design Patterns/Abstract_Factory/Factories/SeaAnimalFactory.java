package Factories;

import Animal.Actopus;
import Animal.Animal;
import Animal.Shark;

public class SeaAnimalFactory extends AnimalTypeFactory {

    @Override
    public Animal createAnimal(String Animaltype) {
        if (Animaltype.equalsIgnoreCase("Shark")) {
            return new Shark();
        } else if (Animaltype.equalsIgnoreCase("Actopus")) {
            return new Actopus();
        }
        return null;
    }

}
