package unit10.shop.dao;

import java.util.List;
import java.util.Set;

public interface GeneralDao<T> {
    void save(T obj);
    void update(T obj);
    List<T> findAll();
    T findById(Long id);
    T findByName(String name);
    void deleteById(Long id);
    void deleteByObj(T obj);

}
