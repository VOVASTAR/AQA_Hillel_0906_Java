package ua.hillel.homeworks.hw18BankClient.viaAbstract;

public class IndividualPerson extends Client {
    public IndividualPerson() {
    }

    public IndividualPerson(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void addMoney(double sum) {
        super.addMoney(sum);
    }

    @Override
    public void takeMoney(double sum) {
        super.takeMoney(sum);
    }

    @Override
    public void aboutAccount() {
        System.out.println("У физических лиц :");
        System.out.println("    - пополнение происходит без комиссии.");
        System.out.println("    - снятие происходит без комиссии.");
        System.out.println("Баланс равен " + this.getAccountMoney() + " usd");
    }
}
