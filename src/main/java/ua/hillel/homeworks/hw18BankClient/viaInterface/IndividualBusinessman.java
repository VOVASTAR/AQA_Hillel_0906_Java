package ua.hillel.homeworks.hw18BankClient.viaInterface;

public class IndividualBusinessman implements Client {

    private double accountMoney;

    public IndividualBusinessman() {
        this.accountMoney = 0.0;
    }

    public IndividualBusinessman(double startDeposit) {
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
        double addSum;
        if (sum < 1000) {
            addSum = sum * 0.99;
        } else {
            addSum = sum * 0.995;
        }
        System.out.print("Вы кладете на счет с учетом комиссии " + sum + " usd\n");
        this.changeBalance(addSum);
    }

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
        System.out.println("У индивидуального предпринимателся :");
        System.out.println("    - пополнение происходит :");
        System.out.println("        с комиссией 1%, если сумма меньше 1000 $");
        System.out.println("        с комиссией 0,5%, если сумма больше либо равна 1000 $");
        System.out.println("    - снятие происходит без комиссии.");
        System.out.println("Баланс равен " + this.getAccountMoney() + " usd");
    }

    public void myBalance() {
        System.out.println("Ваш баланс " + this.getAccountMoney() + " usd");
    }
}
