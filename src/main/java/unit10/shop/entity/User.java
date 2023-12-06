package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private Long id;
    private String username;
    private String password;

    private Set<RolesHasUser> rolesHasUsers;

    private Customer customer;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
