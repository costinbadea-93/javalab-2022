package service;

import model.Animal;
import model.Cat;
import model.Dog;

import java.util.Arrays;

public class AnimalService {

    private AnimalService() {
    }

    private static class SINGLETON_HOLDER {
        private static final AnimalService INSTANCE = new AnimalService();
    }

    public static AnimalService getInstance() {
        return SINGLETON_HOLDER.INSTANCE;
    }

    public Animal[] addAnimal(Animal[] animals, Animal animal) {
        Animal[] temp = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i++) {
            temp[i] = animals[i];
        }
        temp[temp.length - 1] = animal;
        return temp;
    }

    public void listAnimals(Animal[] animals) {
        System.out.println(Arrays.toString(animals));
    }

    public Animal findByName(Animal[] animals, String name) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                if (((Cat) animal).getName().equalsIgnoreCase(name)) {
                    return animal;
                }
            } else if (animal instanceof Dog) {
                if (((Dog) animal).getName().equalsIgnoreCase(name)) {
                    return animal;
                }
            }
        }
        System.out.println("No animal was found for the given name " + name);
        return null;
    }
}
