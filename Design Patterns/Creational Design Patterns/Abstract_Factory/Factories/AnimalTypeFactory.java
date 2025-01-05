package Factories;

import Animal.Animal;

public abstract class AnimalTypeFactory {
    public abstract Animal createAnimal(String Animaltype);

    public static AnimalTypeFactory createFactory(String type) {
        if (type.equalsIgnoreCase("Land")) {
            return new LandAnimalFacoty();
        } else if (type.equalsIgnoreCase("Sea")) {
            return new SeaAnimalFactory();
        }
        return null;
    }
}