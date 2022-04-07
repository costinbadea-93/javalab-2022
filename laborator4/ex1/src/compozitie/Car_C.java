package compozitie;

public class Car_C {
    private final Engine_C engine_c;

    public Car_C(Engine_C engine_c) {
        this.engine_c = engine_c;
    }

    public void move(){
        engine_c.work();
        System.out.println("Car starts working ....");
    }

    public Engine_C getEngine_c() {
        return engine_c;
    }
}
