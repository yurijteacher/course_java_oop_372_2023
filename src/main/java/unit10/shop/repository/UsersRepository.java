package unit10.shop.repository;

import unit10.shop.cofig.ConnectionToDb;
import unit10.shop.dao.UserDao;
import unit10.shop.entity.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersRepository extends ConnectionToDb implements UserDao {

    private final Connection connection;

    public UsersRepository() {
        this.connection = getConnection(CategoryRepository.url, CategoryRepository.username, CategoryRepository.password);
    }


    @Override
    public void save(User obj) {

        CallableStatement cs = null;

        String sql = "{call save(?,?)}";

        try {
           cs =  connection.prepareCall(sql);
           cs.setString(1, obj.getUsername());
            cs.setString(2, obj.getPassword());

           cs.execute();

           cs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(User obj) {

    }

    @Override
    public List<User> findAll() {

        List<User> users = new ArrayList<>();
        CallableStatement cs = null;
        String sql = "{call findAll()}";

        try {
            cs =  connection.prepareCall(sql);
            ResultSet rs = cs.executeQuery();

            while (rs.next()){
                users.add(new User(rs.getString("username"), rs.getString("password")));
            }

            cs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByObj(User obj) {

    }
}
