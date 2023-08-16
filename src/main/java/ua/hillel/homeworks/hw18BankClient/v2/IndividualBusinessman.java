package ua.hillel.homeworks.hw18BankClient.v2;

public class IndividualBusinessman extends Client {

    public IndividualBusinessman() {
    }

    public IndividualBusinessman(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void aboutAccount() {
        System.out.println("У индивидуального предпринимателся :");
        System.out.println("    - пополнение происходит :");
        System.out.println("        с комиссией 1%, если сумма меньше 1000 $");
        System.out.println("        с комиссией 0,5%, если сумма больше либо равна 1000 $");
        System.out.println("    - снятие происходит без комиссии.");
        System.out.println("Баланс равен " + this.getBalance() + " usd");
    }

    @Override
    public void addMoney(double sum) {
        double topUpSum;
        if (sum < 1000) {
            topUpSum = sum * 0.99;
        } else {
            topUpSum = sum * 0.995;
        }
        super.addMoney(topUpSum);
    }

    @Override
    public void takeMoney(double sum) {
        super.takeMoney(sum);
    }
}
