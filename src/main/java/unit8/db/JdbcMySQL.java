package unit8.db;

public class JdbcMySQL implements JdbcDB{
    @Override
    public Object getConnection(String url, String username, String password) {
        return "connection to mysql db";
    }

    @Override
    public void statement(String sql) {
            // ...
    }
}
