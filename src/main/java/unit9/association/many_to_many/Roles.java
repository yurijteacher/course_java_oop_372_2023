package unit9.association.many_to_many;

import java.util.Set;

public class Roles {
    private Long id;
    private String name;

    private Set<Client> clientSet;

}
