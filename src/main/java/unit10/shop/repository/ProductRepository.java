package unit10.shop.repository;

import unit10.shop.cofig.ConnectionToDb;
import unit10.shop.dao.ProductDao;
import unit10.shop.entity.Category;
import unit10.shop.entity.Product;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends ConnectionToDb implements ProductDao {

    private final Connection connection;

    public ProductRepository() {
        this.connection = getConnection(CategoryRepository.url, CategoryRepository.username, CategoryRepository.password);
    }


    @Override
    public void save(Product product) {

        String sql ="INSERT INTO `product` (`name`, `description`, `price`, `images`, `category_id`) " +
                "VALUES (?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setBigDecimal(3, product.getPrice());
            ps.setString(4, product.getImages());
            ps.setInt(5, product.getCategory().getId());

            ps.execute();

            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Product product) {
        String sql ="UPDATE `product` SET `name` = ?, `description` = ?, `price` = ?, `images` = ?, `category_id` = ? WHERE (`id` = ?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setBigDecimal(3, product.getPrice());
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setString(4, product.getImages());
            ps.setInt(5, product.getCategory().getId());
            ps.setInt(6, product.getId());

            ps.execute();

            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement("select * from `product`");
            ResultSet rs = ps.executeQuery();


            while (rs.next()){
                String name = rs.getString("name");
                String description = rs.getString("description");
                int id = rs.getInt("id");
                BigDecimal price = rs.getBigDecimal("price");
                String images = rs.getString("images");
                Category category = new CategoryRepository().findById(rs.getLong("category_id"));

                Product product = new Product();
                product.setId(id);
                product.setName(name);
                product.setDescription(description);
                product.setPrice(price);
                product.setImages(images);
                product.setCategory(category);

                products.add(product);
            }

            rs.close();

            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return products;
    }

    @Override
    public Product findById(Long id) {

        Product product = new Product();

        try {
            PreparedStatement ps = connection.prepareStatement("select * from `product` where `id`=?");
            ps.setInt(1, id.intValue());
            ResultSet rs = ps.executeQuery();


            while (rs.next()){
                String name = rs.getString("name");
                String description = rs.getString("description");
                BigDecimal price = rs.getBigDecimal("price");
                String images = rs.getString("images");
                Category category = new CategoryRepository().findById(rs.getLong("category_id"));

                product.setId(id.intValue());
                product.setName(name);
                product.setDescription(description);
                product.setPrice(price);
                product.setImages(images);
                product.setCategory(category);
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return product;
    }

    @Override
    public Product findByName(String name) {
        Product product = new Product();

        try {
            PreparedStatement ps = connection.prepareStatement("select * from `product` where `name`=?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();


            while (rs.next()){
                String name_ = rs.getString("name");
                String description = rs.getString("description");
                BigDecimal price = rs.getBigDecimal("price");
                String images = rs.getString("images");
                Category category = new CategoryRepository().findById(rs.getLong("category_id"));
                int id = rs.getInt("id");

                product.setId(id);
                product.setName(name_);
                product.setDescription(description);
                product.setPrice(price);
                product.setImages(images);
                product.setCategory(category);
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return product;
    }

    @Override
    public void deleteById(Long id) {

        try {
            PreparedStatement ps = connection.prepareStatement("delete from `product` where `id`=?");
            ps.setInt(1, id.intValue());

            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void deleteByObj(Product product) {
        try {
            PreparedStatement ps = connection.prepareStatement("delete from `product` where `id`=?");
            ps.setInt(1, product.getId());

            ps.executeUpdate();


            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
