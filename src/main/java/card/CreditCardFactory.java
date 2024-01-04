package card;

import client.Client;

public class CreditCardFactory implements CardFactorty {
    @Override
    public Card createCard(Client client) {
        return new CreditCard(client);
    }
}
