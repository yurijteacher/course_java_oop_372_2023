package unit10.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Roles {

    private Long id;
    private String name;

    private Set<RolesHasUser> rolesHasUsers;

}
