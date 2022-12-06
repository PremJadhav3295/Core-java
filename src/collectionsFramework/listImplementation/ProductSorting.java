package collectionsFramework.listImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSorting {
    public static void main(String[] args) {
        Product product1 = new Product(101, "mobile", 10000);
        Product product2 = new Product(1, "pen", 10);
        Product product3 = new Product(10, "Laptop", 30000);
        Product product4 = new Product(11, "cable", 10000);
        Product product5 = new Product(102, "board", 100);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("After Sorting");

         Collections.sort(productList,(p1, p2)-> p1.productId- p2.productId);

       // Collections.sort(productList, new ProductComparator());

       /* Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.productId - o2.productId;
            }
        });*/
        // Collections.sort(productList, Comparator.comparingInt(p ->p.productId));

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}