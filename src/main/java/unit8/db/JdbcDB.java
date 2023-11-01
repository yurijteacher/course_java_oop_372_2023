package unit8.db;

public interface JdbcDB {
    Object getConnection(String url, String username, String password);
    void statement(String sql);


}
