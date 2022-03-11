import model.Animal;
import model.AnimalShop;
import model.Cat;
import model.Dog;
import service.AnimalService;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Animal Shop =>
         *    add animal,
         *    retrieveByName,
         *    listAllAnimals
         */
        Scanner sc = new Scanner(System.in);
        Animal[] animals = new Animal[0];
        AnimalShop animalShop = new AnimalShop("Bucuresti", "AnimalShop1", animals);
        AnimalService animalService = AnimalService.getInstance();

        System.out.println("Welcome to " + animalShop.getName() + " from  " + animalShop.getLocation() + " !!!");
        System.out.println(" Chose one of the following options: ");
        System.out.println("1.Add animal");
        System.out.println("2.List animals");
        System.out.println("3.Find by name");

        while (true) {
            int option = sc.nextInt();
            if (option == 0) {
                break;
            }

            switch (option) {
                case 1: {
                    System.out.println("Chose CAT or DOG");
                    String animalType = sc.next();
                    if (animalType.equalsIgnoreCase("CAT")) {
                        System.out.println("Insert cat Name");
                        String name = sc.next();
                        System.out.println("Insert cat Color");
                        String color = sc.next();
                        Cat cat = new Cat(name, color);
                        animalShop.setAnimals(animalService.addAnimal(animalShop.getAnimals(), cat));
                    } else {
                        System.out.println("Insert dog Name");
                        String name = sc.next();
                        System.out.println("Insert dog Color");
                        String color = sc.next();
                        Dog dog = new Dog(name, color);
                        animalShop.setAnimals(animalService.addAnimal(animalShop.getAnimals(), dog));
                    }
                    break;
                }
                case 2: {
                    animalService.listAnimals(animalShop.getAnimals());
                    break;
                }
                case 3: {
                    System.out.println("Insert animal name");
                    String name = sc.next();
                    Animal animal = animalService.findByName(animalShop.getAnimals(), name);
                    if (animal != null) {
                        System.out.println(animal);
                    }
                    break;
                }
                default:
                    System.out.println("Invalid Option!!!!!");
            }

            System.out.println(" Chose another option!!!!");
        }

    }
}
