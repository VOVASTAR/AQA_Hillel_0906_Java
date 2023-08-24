package ua.hillel.homeworks.hw18BankClient.viaAbstract_v2;

public class IndividualPerson extends Client {
    public IndividualPerson() {
    }

    public IndividualPerson(double startDeposit) {
        super(startDeposit);
    }

    public void setAccountMoney(double sum) {
        System.out.println("Не использовать напрямую");
    }

    @Override
    public void addMoney(double sum) {
        System.out.print("Вы кладете на счет с учетом комиссии " + sum + " usd\n");
        super.setAccountMoney(getAccountMoney() + sum);
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
        System.out.println("У физических лиц :");
        System.out.println("    - пополнение происходит без комиссии.");
        System.out.println("    - снятие происходит без комиссии.");
        System.out.println("Баланс равен " + this.getAccountMoney() + " usd");
    }
}
