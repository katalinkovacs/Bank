package bank;


import java.util.ArrayList;
import java.util.List;

public class StartApp {

    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Katalin", "Kovacs");
        Customer c2 = new Customer(2, "Zoltan", "Kovacs");
        Customer c3 = new Customer(3, "Andrea", "Kerekes");
        Customer c4 = new Customer(4, "Krisztina", "Kallay");
        Customer c5 = new Customer(5, "Ilona", "Nagy");

        Account s1 = new SavingsAccount(10000, 2);
        Account s2 = new SavingsAccount(10000, 2);
        Account s3 = new SavingsAccount(10000, 2);
        Account s4 = new SavingsAccount(10000, 3);
        Account s5 = new SavingsAccount(10000, 2);
        Account s6 = new SavingsAccount(10000, 2);
        Account s7 = new SavingsAccount(10000, 3);
        Account s8 = new SavingsAccount(10000, 2);
        Account s9 = new SavingsAccount(10000, 3);


        Account credit1 = new CreditAccount(1000, 22000);
        Account credit2 = new CreditAccount(2060, 15000);
        Account credit3 = new CreditAccount(3500, 30000);
        Account credit4 = new CreditAccount(4800, 20000);
        Account credit5 = new CreditAccount(5400, 60000);
        Account credit6 = new CreditAccount(6300, 90000);
        Account credit7 = new CreditAccount(7700, 25000);


        ArrayList<Account> account = new ArrayList<Account>();

        c1.addAccount(s1);





    }


}
