package unit9.association.one_to_one;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Clients {

    private Long id;
    private String username;
    private String password;

    private Customer customer;

    public Clients(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    //    @Override
//    public String toString() {
//        return "Clients{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//
//    public Clients() {
//    }
//
//    public Clients(Long id, String username, String password) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
