package unit10.shop.repository;

import unit10.shop.dao.ProductDao;
import unit10.shop.entity.Product;

import java.util.List;

public class ProductRepository implements ProductDao {
    @Override
    public void save(Product obj) {

    }

    @Override
    public void update(Product obj) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByObj(Product obj) {

    }
}
