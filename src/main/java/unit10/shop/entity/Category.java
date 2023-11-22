package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {


    private Long id;
    private String name;
    private String description;
    private List<Images> images;

    private List<Product> products;


}
