package org.fasttrackit.curs8;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public static String retailer = "Auchan";
    public static int quantityOfAllProducts = 0;
    public static int nrOfProducts = 0;
    public static double valueOfProducts = 0;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        quantityOfAllProducts += quantity;
        nrOfProducts++;
        valueOfProducts += price * quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void printProductAndRetailer() {
        System.out.println("Ati cumparat de la " + retailer);
    }

    public static void printOverallSituation() {
        System.out.println(
                String.format("In magazinul %s avem %d tipuri de produse, cuantificand %d unitati",
                        retailer, nrOfProducts, quantityOfAllProducts));
    }

    public static void retrieveValueOfInventory() {
        System.out.println("Valoarea produselor este: " + valueOfProducts);
    }
}
