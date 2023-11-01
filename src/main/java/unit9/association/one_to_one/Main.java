package unit9.association.one_to_one;

public class Main {

    public static void main(String[] args) {

        Clients client = new Clients(1L, "user","pass");

        Customer customer = new Customer();
        customer.setId(1L);
        customer.setEmail("vasya@ukr.net");
        customer.setPhone("+380505112233");
        customer.setFirstName("Vasya");
        customer.setLastNama("Pypkin");
        customer.setClient(client);

        System.out.println(customer);


    }
}
