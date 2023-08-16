package ua.hillel.homeworks.hw18BankClient;

public class IndividualPerson extends Client {
    public IndividualPerson() {
    }

    public IndividualPerson(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void addMoney(double sum) {
        this.setBalance(sum);
        System.out.println(this.getBalance() + " usd");
    }

    @Override
    public void takeMoney(double sum) {
        double takeOut = -sum;
        this.setBalance(takeOut);
        System.out.println(this.getBalance() + " usd");
    }

    @Override
    public void aboutAccount() {
        System.out.println("У физических лиц :");
        System.out.println("    - пополнение происходит без комиссии.");
        System.out.println("    - снятие происходит без комиссии.");
        System.out.println("Баланс равен " + this.getBalance() + " usd");
    }
}
