package bank;

import java.util.ArrayList;


public class StartApp {

    public static void main(String[] args) {

        System.out.println("Main started................");

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

        //Create an ACCOUNT arraylist called account
        ArrayList<Account> account = new ArrayList<Account>();
        //Adding accounts to the arraylist
        account.add(s1);
        account.add(s2);
        account.add(s3);
        account.add(s4);
        account.add(s5);
        account.add(credit6);
        account.add(credit7);

        System.out.println("--------------------------------------------");
        System.out.println("account ArrayList Elements are: " + account);

        for(Account counter: c1.getMyAccounts()){
            System.out.println("in for loop." + counter);
        }

        System.out.println("--------------------------------------------");

        //System.out.println(c1.getMyAccounts());
        c1.printSomething();
        System.out.println(s1.printHello());
        System.out.println(credit1.printHello());

        System.out.println("--------------------------------------------");


        //c1.getMyAccounts().add()

        c1.addAccount(s1);
        c1.addAccount(s2);
        c1.addAccount(s3);
        c1.addAccount(s4);
        c2.addAccount(s5);
        c2.addAccount(credit1);
        c2.addAccount(credit2);

        for(Account counter: c1.getMyAccounts()){
            System.out.println("in for loop." + counter);
        }


      System.out.println(c1.getMyAccounts());

        System.out.println("--------------------------------------------");

        c1.addCreditAccount((CreditAccount) credit1);
        c1.addCreditAccount((CreditAccount) credit2);

        c4.addSavingsAccount((SavingsAccount) s4);
        c5.addSavingsAccount((SavingsAccount) s7);


        System.out.println(c1.getCreditAccounts());







    }


}
