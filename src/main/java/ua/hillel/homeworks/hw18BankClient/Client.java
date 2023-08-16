package ua.hillel.homeworks.hw18BankClient;


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

    public void setBalance(double sum) {
        this.balance = this.getBalance() + sum;
    }

    public abstract void aboutAccount();

    public abstract void addMoney(double sum);

    public abstract void takeMoney(double sum);

}

