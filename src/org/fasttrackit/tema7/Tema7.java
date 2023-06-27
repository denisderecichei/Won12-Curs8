package org.fasttrackit.tema7;

public class Tema7 {

    public static void main(String[] args) {
        //ex1-2
        Person first = new Person("George", 21, false);
        Person second = new Person("Georgiana", 40, true);
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println("------------------------------------------");
        //ex3-4
        Product cola = new Product("Coca Cola", 9.99D, 100, "suc");
        Product pepsi = new Product("Pepsi Cola", 9.49D, 100, "suc");
        Product salamSasec = new Product("Salam Sasec", 30D, 44, "mezeluri");
        Product salamSibiu = new Product("Salam Sibiu", 90D, 0, "mezeluri");
        System.out.println(cola.hasStock());
        System.out.println(pepsi.hasStock());
        System.out.println(salamSasec.hasStock());
        System.out.println(salamSibiu.hasStock());
        System.out.println("+++++++++++++++++++");
        System.out.println(cola.isCategory("suc"));
        System.out.println(cola.isCategory(new String("suc")));
        System.out.println(cola.isCategory("mezeluri"));
        System.out.println("------------------------------------------");

        //ex5-6
        Bottle water = new Bottle(500, 400, false);
        System.out.println("Empty capacity: " + water.getEmptyCapacity());
        water.drinkAmount(100);
        water.openBottle();
        water.drinkAmount(100);
        water.closeBottle();
        water.drinkAmount(500);
        water.openBottle();
        water.drinkAmount(500);
        water.drinkAmount(100);
        water.drinkAmount(100);
        water.drinkAmount(100);
        System.out.println("_____BOTTLE SHOULD BE EMPTY___________");
        water.drinkAmount(100);
        water.drinkAmount(100);
        water.drinkAmount(100);
    }
}
