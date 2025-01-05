import Animal.Animal;
import Factories.AnimalTypeFactory;

public class Main {

    public static void main(String[] args) {
        Animal animal = AnimalTypeFactory.createFactory("land").createAnimal("lion");
        animal.speak();
    }
}