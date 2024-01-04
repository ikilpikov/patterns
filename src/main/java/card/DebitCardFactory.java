package card;

import client.Client;

public class DebitCardFactory implements CardFactorty {
    @Override
    public Card createCard(Client client) {
        return new DebitCard(client);
    }
}