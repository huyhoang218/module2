package factory_method;

public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        if ("canine".equals(animalType)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
