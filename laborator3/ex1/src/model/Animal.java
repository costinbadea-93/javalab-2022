package model;

public class Animal {
    private String color;

    protected void makeSound(){
        System.out.println("Animal will make a sound!!!");
    }

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                '}';
    }
}
