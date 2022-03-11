public class Dog extends Animal {
    public Dog(String color) {
        super(color);
    }

    @Override
    public void makeSound() {
        System.out.println("Ham!!!");
    }
}
