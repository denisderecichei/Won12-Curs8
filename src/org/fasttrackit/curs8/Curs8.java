package org.fasttrackit.curs8;

import java.util.Objects;

public class Curs8 {

    public static void main(String[] args) {
        Product.printOverallSituation();
        Product.retrieveValueOfInventory();
        Product cola = new Product("cola", 100, 9.99D);
        Product.printOverallSituation();
        Product.retrieveValueOfInventory();
        Product inghetata = new Product("napoca", 40, 4.4D);
        Product.printOverallSituation();
        Product.retrieveValueOfInventory();
        System.out.println(cola.getName());
        System.out.println(inghetata.getName());
        System.out.println(cola.retailer);
        System.out.println(inghetata.retailer);
        inghetata.setName("magnum zmeura");
        System.out.println();
        cola.retailer = "Mega-Image";
        System.out.println(cola.getName());
        System.out.println(inghetata.getName());
        System.out.println(cola.retailer);
        System.out.println(inghetata.retailer);

        Product apa = new Product("apa", 50, 3D);
        Product.printOverallSituation();
        Product.retrieveValueOfInventory();
        System.out.println(apa.retailer);

        System.out.println("de pe clasa");
        System.out.println(Product.retailer);
        System.out.println(apa.getName());
//        System.out.println(Product.getName());
        Product.printProductAndRetailer();
        Product ciocolataExpirata = new Product("cioco exp", 100, 0D);
        Product.printOverallSituation();
        Product.retrieveValueOfInventory();
    }
}
