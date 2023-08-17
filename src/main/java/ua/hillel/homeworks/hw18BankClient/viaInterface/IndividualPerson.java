package ua.hillel.homeworks.hw18BankClient.viaInterface;

public class IndividualPerson implements Client {

    private double accountMoney;

    public IndividualPerson() {
        this.accountMoney = 0.0;
    }

    public IndividualPerson(double startDeposit) {
        this.accountMoney = startDeposit;
    }

    public double getAccountMoney() {
        return this.accountMoney;
    }

    private void changeBalance(double sum) {
        this.accountMoney = this.getAccountMoney() + sum;
        System.out.println("    Ваш баланс " + this.getAccountMoney() + " usd");
    }

    @Override
    public void addMoney(double sum) {
        System.out.print("Вы кладете на счет с учетом комиссии " + sum + " usd\n");
        this.changeBalance(sum);
    }

    @Override
    public void takeMoney(double sum) {
        System.out.print("Вы снимаете с учетом комиссии " + sum + " usd\n");
        if (getAccountMoney() > sum) {
            this.changeBalance(-sum);
        } else {
            System.out.println("На вашем балансе недостаточно средств для снятия. Ваш баланс: " + this.getAccountMoney() + " usd");
        }
    }

    @Override
    public void aboutAccount() {
        System.out.println("У физических лиц :");
        System.out.println("    - пополнение происходит без комиссии.");
        System.out.println("    - снятие происходит без комиссии.");
        System.out.println("Баланс равен " + this.getAccountMoney() + " usd");
    }

    @Override
    public void myBalance() {
        System.out.println("Ваш баланс " + this.getAccountMoney() + " usd");
    }
}
