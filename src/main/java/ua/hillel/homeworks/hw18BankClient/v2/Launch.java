package ua.hillel.homeworks.hw18BankClient.v2;

public class Launch {
    public static void main(String[] args) {

//        Client company = new LegalEntity(1200);
//        company.aboutAccount();
//        System.out.println(company.getBalance());
//        company.takeMoney(1200);
//        company.takeMoney(100);
//        company.addMoney(55);
//
        Client fop = new IndividualBusinessman();
        fop.getBalance();
//        fop.addMoney(10000);
        fop.addMoney(999.99);
        fop.takeMoney(988.99);
        System.out.println(fop.getBalance());

//        Client person = new IndividualPerson(100);
//        person.addMoney(230);
//        System.out.println(person.getBalance());
//        person.takeMoney(300);
//        System.out.println(person.getBalance());
//        person.aboutAccount();

    }
}
