package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {


    private int id;
    private String name;
    private String description;
    private String images;

    private List<Product> products;


    public Category(String name, String description, String images) {
        this.name = name;
        this.description = description;
        this.images = images;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
