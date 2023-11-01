package unit9.association.one_to_many;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString

public class Category {
    private Integer id;
    private String name;
    private String description;
    private List<String> image;

    private List<Product> products;


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
//                ", products=" + products +
                '}';
    }
}
