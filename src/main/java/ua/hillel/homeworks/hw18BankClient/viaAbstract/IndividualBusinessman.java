package ua.hillel.homeworks.hw18BankClient.viaAbstract;

public class IndividualBusinessman extends Client {

    public IndividualBusinessman() {
    }

    public IndividualBusinessman(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void addMoney(double sum) {
        double addSum;
        if (sum < 1000) {
            addSum = sum * 0.99;
        } else {
            addSum = sum * 0.995;
        }
        super.addMoney(addSum);
    }

    @Override
    public void takeMoney(double sum) {
        super.takeMoney(sum);
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
}
