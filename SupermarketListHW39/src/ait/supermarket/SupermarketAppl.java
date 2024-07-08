package ait.supermarket;

import ait.supermarket.dao.SupermarketImpl;
import ait.supermarket.model.Product;

import java.time.LocalDate;

public class SupermarketAppl {
    public static void main(String[] args) {
        SupermarketImpl supermarket = new SupermarketImpl();

        supermarket.addProduct(new Product(123456710L, "Milk", "Dairy", "Brand3", 1.2, LocalDate.parse("2024-10-07")));
        supermarket.addProduct(new Product(123456711L, "Sausages", "Meat", "Brand2", 4.7, LocalDate.parse("2024-06-15")));
        supermarket.addProduct(new Product(123456712L, "Butter", "Dairy", "Brand3", 3.4, LocalDate.parse("2024-07-11")));
        supermarket.addProduct(new Product(123456713L, "Beef", "Meat", "Brand4", 8.3, LocalDate.parse("2024-07-22")));
        supermarket.addProduct(new Product(123456714L, "Spaghetti", "Cereals", "Brand3", 2.6, LocalDate.parse("2024-05-05")));
        supermarket.addProduct(new Product(123456715L, "Cookie", "Sweet", "Brand6", 1.5, LocalDate.parse("2025-04-05")));

        System.out.println("=== Supermarket products ===");
        printProducts(supermarket);

        System.out.println("=== Expired products ===");
        printProducts(supermarket.findProductsWithExpiredDate());
    }

    public static void printProducts(Iterable<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
