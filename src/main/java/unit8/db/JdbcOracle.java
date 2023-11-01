package unit8.db;

public class JdbcOracle implements JdbcDB{
    @Override
    public Object getConnection(String url, String username, String password) {
        return "get connection with Oracle";
    }

    @Override
    public void statement(String sql) {

    }
}
