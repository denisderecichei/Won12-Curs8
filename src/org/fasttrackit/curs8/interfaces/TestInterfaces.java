package org.fasttrackit.curs8.interfaces;

import org.fasttrackit.curs8.interfaces.animals.Animal;
import org.fasttrackit.curs8.interfaces.animals.Cat;
import org.fasttrackit.curs8.interfaces.animals.Dog;
import org.fasttrackit.curs8.interfaces.animals.Pinguin;
import org.fasttrackit.curs8.interfaces.events.AppNotificationSender;
import org.fasttrackit.curs8.interfaces.events.EmailSender;
import org.fasttrackit.curs8.interfaces.events.FacebookServer;

public class TestInterfaces {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Pinguin pinguin = new Pinguin();

//        EmailSender emailSender = new EmailSender();
//        AppNotificationSender appSender = new AppNotificationSender();
//        FacebookServer server = new FacebookServer(emailSender, appSender);
//        System.out.println("---------------------");
//        server.publishToAllChannels("mesaj de pe ambele canale");
//        System.out.println("---------------------");
//        server.publishOnlyToEmail("mesaj doar pe email");
//        System.out.println("---------------------");
//        server.publishOnlyToApp("mesaj doar in aplicatie");
//        System.out.println("---------------------");

//        cat.
        Animal.doSomethingElse();
        System.out.println(Animal.NUMELE_FIINTEI);
    }
}
