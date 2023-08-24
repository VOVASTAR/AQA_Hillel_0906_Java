package ua.hillel.homeworks.hw18BankClient.viaAbstract_v2;

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
        System.out.print("Вы кладете на счет с учетом комиссии " + addSum + " usd\n");
        super.setAccountMoney(getAccountMoney() + addSum);
    }

    @Override
    public void takeMoney(double sum) {
        System.out.print("Вы снимаете с учетом комиссии " + sum + " usd\n");
        if (getAccountMoney() > sum) {
            super.setAccountMoney(getAccountMoney() - sum);
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
}
