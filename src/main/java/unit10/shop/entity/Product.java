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

private Long id;
private String name;
private BigDecimal price;

private List<Images> images;

private Category category;

private List<AtributeHasProduct> atributeHasProduct;

private List<ProductHasOrder> productHasOrders;
}
