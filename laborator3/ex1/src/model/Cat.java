package model;

public class Cat extends Animal {
    private String name;

    public Cat(String color, String name) {
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
        System.out.println("Miau!!!");
    }

    //overload
    public void makeSound(String sound){
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
