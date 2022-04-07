package agragare;

public class Car_A {

    private  Engine_A engine;

    public Engine_A getEngine() {
        return engine;
    }

    public void setEngine(Engine_A engine) {
        this.engine = engine;
    }

    public void move(){
        if(engine != null){
            engine.work();
        }
        System.out.println("Car starts moving.....");
    }
}
