package ua.hillel.homeworks.hw18BankClient.viaInterface;

public class Launch {
    public static void main(String[] args) {

        Client company = new LegalEntity(1200.5);
        company.myBalance();
        company.addMoney(2500);
        company.takeMoney(1500);
        company.myBalance();
        company.aboutAccount();

        Client fop = new IndividualBusinessman(1000);
        fop.myBalance();
        fop.addMoney(200);
        fop.takeMoney(300);
        fop.myBalance();
        fop.aboutAccount();

        Client person = new IndividualPerson(100);
        person.myBalance();
        person.addMoney(1600.5);
        person.takeMoney(1300);
        person.myBalance();
        person.aboutAccount();
    }
}
