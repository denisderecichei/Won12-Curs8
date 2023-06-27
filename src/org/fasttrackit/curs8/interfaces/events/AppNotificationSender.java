package org.fasttrackit.curs8.interfaces.events;

public class AppNotificationSender implements EventSender{
    @Override
    public void publishMessage(String mesaj) {
        System.out.println("MESAJ DIN NOTIFICARE TELEFON" + mesaj);
    }
}
