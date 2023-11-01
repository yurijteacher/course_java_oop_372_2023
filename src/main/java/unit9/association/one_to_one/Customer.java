package unit9.association.one_to_one;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Customer {

    private Long id;

    private String firstName;
    private String lastNama;
    private String phone;
    private String email;

    private Clients client;
}
