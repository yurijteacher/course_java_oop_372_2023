package unit9.aggregation;
public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine(1L,"honda","3000");

        Car car = new Car(engine);
        Car car1 = new Car(engine);
    }
}
