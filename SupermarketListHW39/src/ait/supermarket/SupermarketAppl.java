package ait.supermarket;

import ait.supermarket.dao.SupermarketImpl;
import ait.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public class SupermarketAppl {
    public static void main(String[] args) {
        SupermarketImpl supermarket = new SupermarketImpl(new ArrayList<>());

        Product[] products = new Product[6];
        products[0] = new Product(123456710L, "Milk", "Dairy", "Brand3", 1.2, LocalDate.parse("2024-10-07"));
        products[1] = new Product(123456711L, "Sausages", "Meat", "Brand2", 4.7, LocalDate.parse("2024-06-15"));
        products[2] = new Product(123456712L, "Butter", "Dairy", "Brand3", 3.4, LocalDate.parse("2024-07-11"));
        products[3] = new Product(123456713L, "Beef", "Meat", "Brand4", 8.3, LocalDate.parse("2024-07-22"));
        products[4] = new Product(123456714L, "Spaghetti", "Cereals", "Brand3", 2.6, LocalDate.parse("2024-05-05"));
        products[5] = new Product(123456715L, "Cookie", "Sweet", "Brand6", 1.5, LocalDate.parse("2025-04-05"));

        for (int i = 0; i < products.length; i++) {
            supermarket.addProduct(products[i]);
        }

        System.out.println("=== Supermarket products ===");
        printProducts(supermarket);
//        System.out.println("Quantity = " + supermarket.skuQuantity());

        System.out.println("=== Expired products ===");
        printProducts(supermarket.findProductsWithExpiredDate());

//        System.out.println("=== Tests ===");
//        System.out.println(supermarket.findByBarCode(123456711L));
//        System.out.println(supermarket.findByBarCode(123456700L));
//        System.out.println(supermarket.removeProduct(123456713L));
//        System.out.println(supermarket.skuQuantity());
//        System.out.println(supermarket.removeProduct(123456713L));
//        System.out.println(supermarket.skuQuantity());
//        printProducts(supermarket);
//        printProducts(supermarket.findByCategory("Dairy"));
//        printProducts(supermarket.findByBrand("Brand3"));
    }

    public static void printProducts(Iterable<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
