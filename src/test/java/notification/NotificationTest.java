package notification;

import client.Client;
import credit.Credit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import request.Request;

class NotificationTest {
    private Request request;

    @BeforeEach
    void setUp() {
        Client client = new Client("Антон", "123456", 120_000.0, 0.8);
        Credit credit = new Credit(10_000, 16.5, 5, 2330);
        request = new Request(client, credit);
    }

    @Test
    void sendSmsNotification() {
        Notification notification = new SmsNotification(request);
        notification.send();
    }

    @Test
    void sendEmailNotification() {
        Notification notification = new EmailNotification(request);
        notification.send();
    }

    @Test
    void sendSmsAndEmailNotification() {
        Notification notification = new EmailAndSmsNotification(request);
        notification.send();
    }
}