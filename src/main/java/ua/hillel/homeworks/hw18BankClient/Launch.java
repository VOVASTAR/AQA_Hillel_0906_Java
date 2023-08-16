package ua.hillel.homeworks.hw18BankClient;

public class Launch {
    public static void main(String[] args) {

        Client company = new LegalEntity(200);
        company.aboutAccount();
        System.out.println(company.getBalance());
        company.takeMoney(350);
        company.takeMoney(150);
        company.addMoney(55);

        Client fop=new IndividualBusinessman();
        fop.getBalance();
        fop.addMoney(10000);
        System.out.println(fop.getBalance());

    }
}
