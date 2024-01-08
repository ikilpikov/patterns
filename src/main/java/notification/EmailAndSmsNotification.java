package notification;

import request.Request;

public class EmailAndSmsNotification implements Notification{
    private Request request;

    public EmailAndSmsNotification(Request request) {
        this.request = request;
    }

    @Override
    public void send() {
        new EmailNotification(request).send();
        new SmsNotification(request).send();
    }
}
