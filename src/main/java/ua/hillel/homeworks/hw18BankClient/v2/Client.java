package ua.hillel.homeworks.hw18BankClient.v2;


public abstract class Client {
    private double balance;

    public Client() {
        this.balance = 0.0;
    }

    public Client(double startDeposit) {
        this.balance = startDeposit;
    }

    public double getBalance() {
        return this.balance;
    }

    private void changeBalance(double sum) {
        this.balance = this.getBalance() + sum;
        System.out.println("    Ваш баланс " + this.getBalance() + " usd");
    }

    public abstract void aboutAccount();

    public void addMoney(double sum) {
        System.out.print("Вы кладете на счет с учетом комиссии " + sum + " usd\n");
        this.changeBalance(sum);
    }

    public void takeMoney(double sum) {
        System.out.print("Вы снимаете с учетом комиссии " + sum + " usd\n");
        if (getBalance() > sum) {
            this.changeBalance(-sum);
        } else {
            System.out.println("На вашем балансе недостаточно средств для снятия. Ваш баланс: " + this.getBalance() + " usd");
        }
    }
}

