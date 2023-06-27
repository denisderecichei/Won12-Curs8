package org.fasttrackit.curs8.interfaces.animals;

public class Cat implements Mamifere {
    private int age;

    public void speak() {
        System.out.println("miau");
    }

    public void bite() {
        System.out.println("zgarie");
    }


    public boolean isAnimalOlderThan(int desiredAge) {
        return this.age > desiredAge;
    }

    public void nap() {}


    @Override
    public void nastereNaturala() {

    }
}
