package unit9.association.many_to_many;

import java.util.Set;

public class Client {

    private Long id;
    private String username;
    private String password;
    private Set<Roles> rolesSet;
}
