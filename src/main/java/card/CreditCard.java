package card;

import client.Client;

public class CreditCard implements Card {
    private int balance;
    private Client client;

    public CreditCard(Client client) {
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
        balance -= sum;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "balance=" + balance +
                ", client=" + client +
                '}';
    }
}
