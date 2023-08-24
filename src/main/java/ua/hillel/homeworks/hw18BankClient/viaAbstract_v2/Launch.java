package ua.hillel.homeworks.hw18BankClient.viaAbstract_v2;

public class Launch {
    public static void main(String[] args) {

        Client company = new LegalEntity(1200);
        company.myBalance();
        company.addMoney(235);
        company.takeMoney(555);
        company.myBalance();
        company.setAccountMoney(555);
        company.myBalance();
        System.out.println();

        Client fop = new IndividualBusinessman(1000);
        fop.myBalance();
        fop.addMoney(235);
        fop.takeMoney(555);
        fop.myBalance();
        fop.setAccountMoney(555);
        fop.myBalance();
        System.out.println();

        Client person = new IndividualPerson(1500);
        person.myBalance();
        person.addMoney(235);
        person.takeMoney(555);
        person.myBalance();
        person.setAccountMoney(555);
        person.myBalance();

    }
}
