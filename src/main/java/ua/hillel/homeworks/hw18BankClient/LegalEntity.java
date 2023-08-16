package ua.hillel.homeworks.hw18BankClient;

public class LegalEntity extends Client {
    public LegalEntity() {
    }

    public LegalEntity(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void aboutAccount() {
        System.out.println("У юридических лиц :");
        System.out.println("    - пополнение происходит без комиссии.");
        System.out.println("    - снятие происходит c комиссией 1%.");
        System.out.println("Баланс равен " + this.getBalance() + " usd");
    }

    @Override
    public void addMoney(double sum) {
        this.setBalance(sum);
        System.out.println(this.getBalance() + " usd");
    }

    @Override
    public void takeMoney(double sum) {
        if (getBalance() > sum) {
            double takeOutWithTax = -sum * 1.01;
            this.setBalance(takeOutWithTax);
            System.out.println(this.getBalance() + " usd");
        } else {
            System.out.println("На вашем балансе недостаточно средств для снятия. Ваш баланс: " + getBalance() + " usd");
        }
    }

}
