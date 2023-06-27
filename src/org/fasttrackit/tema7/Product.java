package org.fasttrackit.tema7;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        return this.quantity > 0;
//        if (this.quantity > 0) {
//            return true;
//        } else {
//            return false;
//        }
//        return this.quantity > 0 ? true : false;
    }

    public boolean isCategory(String category) {
        return this.category.equals(category);
    }
}
