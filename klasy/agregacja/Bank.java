package klasy.agregacja;

class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "90897812362";

        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        //osoba  z roznym adresem
        Person person2 = new Person();
        person2.firstName = "Steve";
        person2.lastName = "Cooper";
        person2.pesel = "910887887";
        person2.legalAddress = "Trinity Road " + " Birmingham B6 6HE ";
        person2.residenceAddress = "Fullham Road " + " London " + " SW6 1 HS";

        Person person3 = new Person();
        person3.firstName = "Steve";
        person3.lastName = "Gerrard";
        person3.pesel = "9898989986";
        person3.legalAddress = person2.residenceAddress;
        person3.residenceAddress = person2.residenceAddress;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        BankAccount account3 = new BankAccount();
        account3.owner = person3;
        account3.balance = 12_000;

        //print

        System.out.println("Osoba 1");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("Mieszka pod adresem " + person2.residenceAddress);
        System.out.println("Adres zameldowania: " + person2.legalAddress);
        System.out.println("Posiada konto bankowe z kwota: " + account2.balance + " PLN");

        System.out.println("Osoba 2");
        System.out.println(person3.firstName + " " + person3.lastName);
        System.out.println("Mieszka pod adresem " + person3.residenceAddress);
        System.out.println("Adres zameldowania: " + person3.legalAddress);
        System.out.println("Posiada konto bankowe z kwota: " + account3.balance + " PLN");

    }
}