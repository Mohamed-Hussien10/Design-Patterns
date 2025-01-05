package Factories;

import Animal.Animal;
import Animal.Cat;
import Animal.Dog;
import Animal.Lion;

public class LandAnimalFacoty extends AnimalTypeFactory {

    @Override
    public Animal createAnimal(String Animaltype) {
        if (Animaltype.equalsIgnoreCase("Cat")) {
            return new Cat();

        } else if (Animaltype.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (Animaltype.equalsIgnoreCase("Lion")) {
            return new Lion();
        }
        return null;
    }

}