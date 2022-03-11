package model;

import java.util.Arrays;

public class AnimalShop {
    private String location;
    private String name;
    private Animal [] animals = new Animal[0];

    public AnimalShop(String location, String name, Animal[] animals) {
        this.location = location;
        this.name = name;
        this.animals = animals;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "AnimalShop{" +
                "location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
