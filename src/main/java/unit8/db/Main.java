package unit8.db;

public class Main {

    public static void main(String[] args) {

        JdbcMySQL mySQL = new JdbcMySQL();
        System.out.println(mySQL.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root"));
        JdbcOracle oracle = new JdbcOracle();
        System.out.println(oracle.getConnection("jdbc:oracle://localhost:4321/test2", "qwerty1234", "root"));


    }
}
