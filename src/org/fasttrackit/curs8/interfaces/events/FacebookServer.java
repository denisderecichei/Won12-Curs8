package org.fasttrackit.curs8.interfaces.events;

public class FacebookServer {
    private EmailSender emailSender;
    private AppNotificationSender appNotificationSender;

    public FacebookServer(EmailSender emailSender, AppNotificationSender appNotificationSender) {
        this.emailSender = emailSender;
        this.appNotificationSender = appNotificationSender;
    }

    public EmailSender getEmailSender() {
        return emailSender;
    }

    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public AppNotificationSender getAppNotificationSender() {
        return appNotificationSender;
    }

    public void setAppNotificationSender(AppNotificationSender appNotificationSender) {
        this.appNotificationSender = appNotificationSender;
    }

    public void publishToAllChannels(String mesaj) {
        emailSender.publishMessage(mesaj);
        appNotificationSender.publishMessage(mesaj);
    }

    public void publishOnlyToEmail(String mesaj) {
        emailSender.publishMessage(mesaj);
    }

    public void publishOnlyToApp(String mesaj) {
        appNotificationSender.publishMessage(mesaj);
    }
}
