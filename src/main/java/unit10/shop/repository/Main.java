package unit10.shop.repository;

import unit10.shop.entity.Category;
import unit10.shop.entity.Product;
import unit10.shop.entity.User;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // JUnit

        CategoryRepository categoryRepository = new CategoryRepository();
//
//        Category category = new Category();
//        category.setName("beer");
//        category.setDescription("asdf sadf sad ");
//        category.setImages("images/image.jpg");
//
//
//        categoryRepository.save(category);

        List<Category> categoryList = categoryRepository.findAll();

        for (Category c : categoryList) {
            System.out.println(c);
        }

        Category category = categoryRepository.findById(1L);

        System.out.println(category);



        Category category2 = categoryRepository.findByName("beer");

//        System.out.println(category2);


//        categoryRepository.deleteByObj(category2);
        category.setName("beer");

        categoryRepository.update(category);

        List<Category> categoryList2 = categoryRepository.findAll();

        for (Category c : categoryList2) {
            System.out.println("delete: " + c);
        }


        Product product = new Product("beer1", "asd sad ass", new BigDecimal(20.50), "/beer.jpg", category);


        ProductRepository productRepository = new ProductRepository();

        productRepository.save(product);

        List<Product> products = productRepository.findAll();

        for (Product el : products
             ) {
            System.out.println(el);
        }


        Product product1 = productRepository.findById(6L);
        product1.setName("beer3");

        productRepository.update(product1);
        Product product2 = productRepository.findByName("beer3");

        System.out.println(product2);

        productRepository.deleteByObj(product2);

        List<Product> products2 = productRepository.findAll();

        for (Product el : products2
        ) {
            System.out.println(el);
        }


        UsersRepository usersRepository = new UsersRepository();

        User user = new User();
        user.setUsername("111");
        user.setPassword("222");

        usersRepository.save(user);

        List<User> users = usersRepository.findAll();

        for (User el : users
             ) {
            System.out.println(el);
        }

    }

}
