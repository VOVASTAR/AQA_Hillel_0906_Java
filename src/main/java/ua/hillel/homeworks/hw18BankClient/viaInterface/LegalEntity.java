package ua.hillel.homeworks.hw18BankClient.viaInterface;

public class LegalEntity implements Client {

    private double accountMoney;

    public LegalEntity() {
        this.accountMoney = 0.0;
    }

    public LegalEntity(double startDeposit) {
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
        double takeOutWithTax = sum * 1.01;
        if (getAccountMoney() > takeOutWithTax) {
            this.changeBalance(-takeOutWithTax);
        } else {
            System.out.println("На вашем балансе недостаточно средств для снятия. Ваш баланс: " + this.getAccountMoney() + " usd");
        }
    }

    @Override
    public void aboutAccount() {
        System.out.println("У юридических лиц :");
        System.out.println("    - пополнение происходит без комиссии.");
        System.out.println("    - снятие происходит c комиссией 1%.");
        System.out.println("Баланс равен " + this.getAccountMoney() + " usd");
    }

    @Override
    public void myBalance() {
        System.out.println("Ваш баланс " + this.getAccountMoney() + " usd");
    }
}
