package card;

import client.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardFactoryTest {
    private Client client;
    private CardFactorty creditCardactory;
    private CardFactorty debitCardactory;

    @BeforeEach
    void setUp() {
        client = new Client("Антон", "123456", 120_000.0, 0.8);
        creditCardactory = new CreditCardFactory();
        debitCardactory = new DebitCardFactory();
    }

    @Test
    void createDebitCard() {
        Card debitCard = debitCardactory.createCard(client);
        assertNotNull(debitCard);

        System.out.println(debitCard);
    }

    @Test
    void createCreditCard() {
        Card creditCard = creditCardactory.createCard(client);
        assertNotNull(creditCard);

        System.out.println(creditCard);
    }
}