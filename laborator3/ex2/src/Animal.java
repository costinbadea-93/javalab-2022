public abstract class Animal {

    /**
     * o clasa abstracta se va declara folosind abstract
     * o clasa abstracta poate sa aiba metode abstracte dar si metode non abstracte
     * o clasa abstrracta nu poate fi instantiata
     * o clasa abstracta poate avea consturctori
     */
    private String color;

    public Animal(String color) {
        this.color = color;
    }

    //metoda abstracta
    public abstract void makeSound();

    public void makeSoundAgain(){
        System.out.println("Make sound again");
    }
}
