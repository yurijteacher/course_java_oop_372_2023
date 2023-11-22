package unit10.shop.repository;

import unit10.shop.dao.UserDao;
import unit10.shop.entity.User;

import java.util.List;

public class UserRepository implements UserDao {
    @Override
    public void save(User obj) {

    }

    @Override
    public void update(User obj) {

    }

    @Override
    public List<User> findAll() {
        return null;
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
