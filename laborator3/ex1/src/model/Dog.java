package model;

public class Dog extends Animal{
    private String name;

    public Dog(String color, String name) {
        super(color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Hammmm!!!");
    }

    //overload
    public void makeSound(String sound){
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
