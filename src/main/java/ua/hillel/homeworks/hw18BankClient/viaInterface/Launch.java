package ua.hillel.homeworks.hw18BankClient.viaInterface;

public class Launch {
    public static void main(String[] args) {

        Client company = new LegalEntity(1200.5);

        Client fop = new IndividualBusinessman();

        Client person = new IndividualPerson(100);

    }
}
