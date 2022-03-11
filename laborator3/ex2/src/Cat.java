public class Cat extends Animal {
    public Cat(String color) {
        super(color);
    }

    @Override
    public void makeSound() {
        System.out.println("Miau!!!");
    }
}
