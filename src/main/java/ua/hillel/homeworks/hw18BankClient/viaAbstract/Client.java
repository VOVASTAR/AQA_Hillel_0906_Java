package ua.hillel.homeworks.hw18BankClient.viaAbstract;


public abstract class Client {

    private double accountMoney;

    public Client() {
        this.accountMoney = 0.0;
    }

    public Client(double startDeposit) {
        this.accountMoney = startDeposit;
    }

    public double getAccountMoney() {
        return this.accountMoney;
    }

    private void changeBalance(double sum) {
        this.accountMoney = this.getAccountMoney() + sum;
        System.out.println("    Ваш баланс " + this.getAccountMoney() + " usd");
    }

    public abstract void aboutAccount();

    public void addMoney(double sum) {
        System.out.print("Вы кладете на счет с учетом комиссии " + sum + " usd\n");
        this.changeBalance(sum);
    }

    public void takeMoney(double sum) {
        System.out.print("Вы снимаете с учетом комиссии " + sum + " usd\n");
        if (getAccountMoney() > sum) {
            this.changeBalance(-sum);
        } else {
            System.out.println("На вашем балансе недостаточно средств для снятия. Ваш баланс: " + this.getAccountMoney() + " usd");
        }
    }

    public void myBalance() {
        System.out.println("Ваш баланс " + this.getAccountMoney() + " usd");
    }
}

