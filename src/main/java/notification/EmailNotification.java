package notification;

import request.Request;

public class EmailNotification implements Notification {
    private Request request;

    public EmailNotification(Request request) {
        this.request = request;
    }

    @Override
    public void send() {
        System.out.println("Клиенту с ID "
                + request.getClient().getDocumentId()
                + " отправлена анкета по электронной почте c SMS уведомлением.");
    }
}
