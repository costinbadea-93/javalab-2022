import agragare.Car_A;
import agragare.Engine_A;
import compozitie.Car_C;
import compozitie.Engine_C;

public class Main {
    public static void main(String[] args) {
        /**
         * agregarea si compozitia sunt doua tipuri de asocieri
         */


        Engine_A engine_a = new Engine_A();
        Engine_A engine_a2 = new Engine_A();
        Engine_C engine_c = new Engine_C();

        //agregare
        //weak association
        Car_A car_a =  new Car_A();
        car_a.setEngine(engine_a2);


        //Compozitie
        //strong association
        Car_C car_c = new Car_C(engine_c);

        car_a.move();
        car_c.move();
    }
}
