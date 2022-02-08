public class Bank {
    public static void main(String[] args) {

        Adress adress1 = new Adress();
        adress1.city = "Kraków";
        adress1.street = "nowa";

        Adress adress2 = new Adress();
        adress2.city = "Warszawa";
        adress2.street = "Stara";

        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "90121212345";
        person1.livingAdress = adress1;
        person1.registrationAdress = adress2;

        System.out.println(person1.livingAdress.street);

//        person1.livingAdress.street = "Ulica1";
//        person1.livingAdress.homeNumber = 12;
//        person1.livingAdress.apartmentNumber = 9;
//        person1.livingAdress.postCode = "00-400";
//        person1.livingAdress.city = "Gitowo";
//
//        person1.registrationAdress.street = "Ulica2";
//        person1.registrationAdress.homeNumber = 112;
//        person1.registrationAdress.apartmentNumber = 4;
//        person1.registrationAdress.postCode = "10-400";
//        person1.registrationAdress.city = "Mieszkankowo";
//
//
//        Person person2 = new Person();
//        person2.firstName = "Mariusz";
//        person2.lastName = "Osuch";
//        person2.pesel = "12345678900";
//        person2.livingAdress.street = "Ulica1";
//        person2.livingAdress.homeNumber = 12;
//        person2.livingAdress.apartmentNumber = 9;
//        person2.livingAdress.postCode = "00-400";
//        person2.livingAdress.city = "Gitowo";
//
//        person2.registrationAdress.street = "Ulica3";
//        person2.registrationAdress.homeNumber = 1;
//        person2.registrationAdress.apartmentNumber = 1;
//        person2.registrationAdress.postCode = "10-300";
//        person2.registrationAdress.city = "Fajnowo";
//
//
//        BankAccount account1 = new BankAccount();
//        account1.owner = person1;
//        account1.balance = 10_000;
//
//        BankAccount account2 = new BankAccount();
//        account2.owner = person2;
//        account2.balance = 100;
//
//
//        Credit credit1 = new Credit();
//        credit1.borrower = person1;
//        credit1.cashBorrowed = 5000;
//        credit1.cashReturned = 0;
//        credit1.interestRate = 0.10;
//        credit1.termMonths = 12;
//
//        Credit credit2 = new Credit();
//        credit2.borrower = person2;
//        credit2.cashBorrowed = 0;
//        credit2.interestRate = 0;
//        credit2.termMonths = 0;
//        credit2.cashReturned = 0;
//
//
//        System.out.println("Osoba: ");
//        System.out.print(person1.firstName + " " + person1.lastName + " " + person1.pesel);
//        System.out.print("posiada konto bankowe z kwotą: " + account1.balance + "zł");
//        System.out.print(", posiada kredyt " + credit1.cashBorrowed + "zł");
//        System.out.print(" oraz mieszka w " + person1.livingAdress);
//
//        System.out.println("Osoba: ");
//        System.out.print(person2.firstName + " " + person2.lastName + " " + person2.pesel);
//        System.out.print("posiada konto bankowe z kwotą: " + account2.balance + "zł");
//        System.out.print(", posiada kredyt " + credit2.cashBorrowed + "zł");
//        System.out.print(" oraz mieszka w " + person2.livingAdress);

    }
}
