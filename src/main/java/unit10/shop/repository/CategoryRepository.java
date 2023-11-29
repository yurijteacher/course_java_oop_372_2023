package unit10.shop.repository;

import unit10.shop.cofig.ConnectionToDb;
import unit10.shop.dao.CategoryDao;
import unit10.shop.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao {

    private final static String url ="jdbc:mysql://localhost:3306/test_group_372";
    private final static String username = "root";
    private final static String password = "root1234";

    // Statement
    // PreparedStatement
    // CallableStatement

    private final Connection connection;

    public CategoryRepository() {
        connection = super.getConnection(url, username, password);
    }


    @Override
    public void save(Category category) {

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.execute("INSERT INTO `category` (`name`, `description`, `images`) VALUES " +
                    "('"+category.getName()+"', '"+category.getDescription()+"', '"+category.getImages()+"');");

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
           if(statement!=null){
               try {
                   statement.close();
               } catch (SQLException e) {
                   throw new RuntimeException(e);
               }
           }
        }


    }

    @Override
    public void update(Category obj) {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE `category` SET `name` = '"+obj.getName()+"', `description` = '"+obj.getDescription()+"', `images` = '"+obj.getImages()+"' WHERE `id` = '"+obj.getId()+"';");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    @Override
    public void deleteByObj(Category obj) {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM `category` WHERE `id` = '"+obj.getId()+"';");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public void deleteAll(){
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM `category`;");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `category`");

            while (resultSet.next()){
                Category category = new Category();

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                String images = resultSet.getString("images");


                category.setId(id);
                category.setName(name);
                category.setDescription(description);
                category.setImages(images);

//                categories.add(new Category(name, description, images));
                categories.add(category);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //
        }


        return categories;
    }

    @Override
    public Category findById(Long id) {

        Statement statement = null;
        Category category = new Category();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `category` WHERE `id` ='"+id+"'");

            while (resultSet.next()){

                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                String images = resultSet.getString("images");


                category.setId(id.intValue());
                category.setName(name);
                category.setDescription(description);
                category.setImages(images);

            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //
        }

        return category;
    }

    @Override
    public Category findByName(String name) {

        Statement statement = null;
        Category category = new Category();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `category` WHERE `name` ='"+name+"'");

            while (resultSet.next()){

                int id = resultSet.getInt("id");
                String name1 = resultSet.getString("name");
                String description = resultSet.getString("description");
                String images = resultSet.getString("images");


                category.setId(id);
                category.setName(name1);
                category.setDescription(description);
                category.setImages(images);

            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //
        }

        return category;

    }

    @Override
    public void deleteById(Long id) {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM `category` WHERE `id` = '"+id+"';");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
