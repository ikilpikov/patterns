package notification;

import request.Request;

public class SmsNotification implements Notification {
    private Request request;

    public SmsNotification(Request request) {
        this.request = request;
    }

    @Override
    public void send() {
        System.out.println("Клиенту с ID "
                + request.getClient().getDocumentId()
                + " отправлена анкета по SMS.");
    }
}
