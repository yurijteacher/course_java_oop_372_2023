package unit10.shop.repository;

import unit10.shop.entity.Category;

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



    }

}
