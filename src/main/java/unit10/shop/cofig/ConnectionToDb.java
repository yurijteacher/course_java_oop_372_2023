package unit10.shop.cofig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {

    private Connection connection = null;
    public Connection getConnection(String url, String username, String password){

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connection to DB!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}
