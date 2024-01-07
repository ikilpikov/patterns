package credit.handler;

import client.Client;
import credit.Credit;
import exception.BankException;
import request.Request;

public class CreditValidator extends AbstractHandler{
    @Override
    public void handle(Request request) {
        Credit credit = request.getCredit();
        if(credit.getAmount() == 0
            || credit.getMonthlyFee() == 0
            || credit.getAmount() == 0) {
            throw new BankException("Данные о кредите пустые.");
        }

        System.out.println("Данные о кредите корректны.");
        super.handle(request);
    }
}
