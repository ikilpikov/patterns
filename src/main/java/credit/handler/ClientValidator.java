package credit.handler;

import client.Client;
import exception.BankException;
import request.Request;

public class ClientValidator extends AbstractHandler {
    @Override
    public void handle(Request request) {
        Client client = request.getClient();
        if (client.getFullName().isEmpty() || client.getDocumentId().isEmpty()) {
            throw new BankException("Данные о клиенте пустые.");
        }

        System.out.println("Данные о клиенте корректны.");
    }
}
