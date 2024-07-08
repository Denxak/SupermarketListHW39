package ait.supermarket.model;

import java.time.LocalDate;

public class Product {
    private long barCode;
    private String name;
    private String category;
    private String brand;
    private double price;
    private LocalDate expDate;

    public Product(long barCode, String name, String category, String brand, double price, LocalDate expDate) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.expDate = expDate;
    }

    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("barCode=").append(barCode);
        sb.append(", name='").append(name).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", expDate=").append(expDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Product product)) return false;

        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(barCode);
    }
}
