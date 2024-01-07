package credit.handler;

import card.CreditCardFactory;
import card.DebitCardFactory;
import client.Client;
import credit.Credit;
import exception.BankException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import request.Request;

import static org.junit.jupiter.api.Assertions.*;

class CreditRequestChainTest {
    private Request request;

    @Test
    void ReqestChainSuccessTest() {
        Client client = new Client("Антон", "123456", 120_000.0, 0.8);
        Credit credit = new Credit(10_000, 16.5, 5, 2330);
        request = new Request(client, credit);

        ClientValidator clientValidator = new ClientValidator();
        CreditValidator creditValidator = new CreditValidator();
        ClientStatsHandler clientStatsHandler = new ClientStatsHandler();

        clientValidator.setNext(creditValidator);
        creditValidator.setNext(clientStatsHandler);

        clientValidator.handle(request);
    }

    @Test
    void ReqestChainFailTest() {
        Client client = new Client("Антон", "123456", 120_000.0, 0.4);
        Credit credit = new Credit(10_000, 16.5, 5, 2330);
        request = new Request(client, credit);

        ClientValidator clientValidator = new ClientValidator();
        CreditValidator creditValidator = new CreditValidator();
        ClientStatsHandler clientStatsHandler = new ClientStatsHandler();

        clientValidator.setNext(creditValidator);
        creditValidator.setNext(clientStatsHandler);

        assertThrows(BankException.class, () -> {
            clientValidator.handle(request);
        });

    }
}