package ait.supermarket.dao;

import ait.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SupermarketImpl implements Supermarket {
    private Collection<Product> products;

    public SupermarketImpl(Collection<Product> products) {
        this.products = products;
    }

    @Override
    public boolean addProduct(Product product) {
        if (product == null) {
            throw new RuntimeException("Product is null");
        }
        if (findByBarCode(product.getBarCode()) != null) {
            return false;
        }
        return products.add(product);
    }

    @Override
    public Product removeProduct(long barCode) {
        Product product = findByBarCode(barCode);
        products.remove(product);
        return product;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        List<Product> res = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                res.add(product);
            }
        }
        return res;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        List<Product> res = new ArrayList<>();
        for (Product product : products) {
            if (product.getBrand().equals(brand)) {
                res.add(product);
            }
        }
        return res;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        List<Product> res = new ArrayList<>();
        for (Product product : products) {
            if (product.getExpDate().isBefore(LocalDate.now())) {
                res.add(product);
            }
        }
        return res;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
