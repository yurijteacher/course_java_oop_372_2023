package unit9.association.one_to_many;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Category beer = new Category();
        beer.setId(1);
        beer.setDescription("asd asd asd ");
        beer.setName("beer");

        List<String> images = new ArrayList<>();
        images.add("red");
        images.add("green");

        beer.setImage(images);


        Product beer1 = new Product();
        beer1.setId(1);
        beer1.setName("beer1");
        beer1.setDecsription("asd asd asd ");
        beer1.setPrice(new BigDecimal(25.00));
        beer1.setCategory(beer);

        Product beer2 = new Product();
        beer2.setId(2);
        beer2.setName("beer2");
        beer2.setDecsription("dasd asd asd ");
        beer2.setPrice(new BigDecimal(35.00));
        beer2.setCategory(beer);


        List<Product> products = new ArrayList<>();
        products.add(beer1);
        products.add(beer2);

        beer.setProducts(products);

        System.out.println(beer);



    }

}
