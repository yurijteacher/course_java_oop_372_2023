package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class Order {

    private Long id;
    private Date dateCreated;
    private Customer customer;

    private List<ProductHasOrder> productHasOrder;
}
