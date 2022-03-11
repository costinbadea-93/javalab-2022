import model.Animal;
import model.Cat;
import model.Dog;

public class Main {
    public static void main(String[] args) {

        /**
         * super trebuie apelat ca si prima instructiune in constructor
         * nu putem face extends pe final
         * override => suprascriere dam un comportament a ceva ce exista
         * overload => definirea unei funcii similare cu numar diferit de parametri
         * nu putem face override peste ceva static sau final
         *
         */

        Cat cat = new Cat("Rosu","Mitzi");
        Dog dog = new Dog("Negru","Rex");

        Animal cat2 = new Cat("Neagra", "Tigrut");
        Animal dog2 = new Dog("Negru", "Leut");

        System.out.println(cat2 instanceof Cat);
        System.out.println(dog2 instanceof Dog);

        System.out.println(cat.getName() + "will make a sound: ");
        cat.makeSound();
        cat.makeSound("Miau2!!!");

        System.out.println(dog.getName() + "will make a sound: ");
        dog.makeSound();
        dog.makeSound("Ham2");
    }
}
