package credit;

public class Credit {
    private double amount;
    private double percentage;
    private int term;
    private double monthlyFee;

    public Credit(double amount, double percentage, int term, double monthlyFee) {
        this.amount = amount;
        this.percentage = percentage;
        this.term = term;
        this.monthlyFee = monthlyFee;
    }

    public double getAmount() {
        return amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getTerm() {
        return term;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}
