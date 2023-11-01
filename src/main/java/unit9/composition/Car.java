package unit9.composition;

public class Car {

    private Long id;
    private String name;
    private Engine engine;


    public Car() {
        engine = new Engine(1L, "honda", "3000");
    }
}
