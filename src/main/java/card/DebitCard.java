package card;

import client.Client;

public class DebitCard implements Card{
    private int balance;
    private Client client;

    public DebitCard(Client client) {
        balance = 0;
        this.client = client;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void increaseBalance (int sum) {
        balance += sum;
    }

    @Override
    public void decreaseBalance (int sum) {
        if (balance - sum > 0) {
            balance -= sum;
        }
    }
}
