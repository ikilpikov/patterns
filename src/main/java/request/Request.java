package request;

import client.Client;
import credit.Credit;

public class Request {
    private Client client;
    private Credit credit;

    public Request(Client client, Credit credit) {
        this.client = client;
        this.credit = credit;
    }

    public Client getClient() {
        return client;
    }

    public Credit getCredit() {
        return credit;
    }
}
