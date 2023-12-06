package unit10.shop.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

private int id;
private String name;
private BigDecimal price;

private String description;

private String images;

private Category category;

private List<AtributeHasProduct> atributeHasProduct;

private List<ProductHasOrder> productHasOrders;

    public Product(String name, String description, BigDecimal price, String images, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.images = images;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", images='" + images + '\'' +
                ", category=" + category +
                '}';
    }
}
