package unit10.shop.repository;

import unit10.shop.dao.AddressDao;
import unit10.shop.entity.Address;

import java.util.List;

public class AddressRepository implements AddressDao {
    @Override
    public void save(Address obj) {

    }

    @Override
    public void update(Address obj) {

    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(Long id) {
        return null;
    }

    @Override
    public Address findByName(String name) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByObj(Address obj) {

    }
}
