package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RolesHasUser {


    private Long id;
    private Roles roles;
    private User user;

}
