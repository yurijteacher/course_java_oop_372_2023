package unit9.association.one_to_many;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {

    private Integer id;
    private String name;
    private String decsription;
    private BigDecimal price; // double
    private Category category;

}
