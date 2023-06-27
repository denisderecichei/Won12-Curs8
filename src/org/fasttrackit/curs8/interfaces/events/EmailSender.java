package org.fasttrackit.curs8.interfaces.events;

public class EmailSender implements EventSender {
    public void publishMessage(String mesaj) {
        System.out.println("EMAIL AT facebook.com@: " + mesaj);
    }
}
