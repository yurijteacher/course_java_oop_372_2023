package unit9.aggregation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Car {

    private Long id;
    private String name;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
