package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String fullName;

    private int age;

    private String education;
    private String phone;
    private String email;

    private User user;

    private List<Address> addresses;

    private List<Order> orders;
}
