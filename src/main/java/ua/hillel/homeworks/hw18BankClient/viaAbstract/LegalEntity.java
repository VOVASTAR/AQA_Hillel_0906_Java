package ua.hillel.homeworks.hw18BankClient.viaAbstract;

public class LegalEntity extends Client {
    public LegalEntity() {
    }

    public LegalEntity(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void addMoney(double sum) {
        super.addMoney(sum);
    }

    @Override
    public void takeMoney(double sum) {
        double takeOutWithTax = sum * 1.01;
        super.takeMoney(takeOutWithTax);
    }

    @Override
    public void aboutAccount() {
        System.out.println("У юридических лиц :");
        System.out.println("    - пополнение происходит без комиссии.");
        System.out.println("    - снятие происходит c комиссией 1%.");
        System.out.println("Баланс равен " + this.getAccountMoney() + " usd");
    }

}
