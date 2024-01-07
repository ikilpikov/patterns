package credit.handler;

import client.Client;
import credit.Credit;
import exception.BankException;
import request.Request;

public class ClientStatsHandler extends AbstractHandler {
    @Override
    public void handle(Request request) {
        Client client = request.getClient();
        Credit credit = request.getCredit();

        if (client.getCreditRating() < 0.5) {
            throw new BankException("Низкий кредитный рейтинг.");
        }
        if (client.getSalary() / credit.getMonthlyFee() * credit.getPercentage() < 2) {
            throw new BankException("Недостаточный уровень дохода клиента.");
        }

        System.out.println("Комплаенс проверка пройдена.");
        super.handle(request);
    }
}
