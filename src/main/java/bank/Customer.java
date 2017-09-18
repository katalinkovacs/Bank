package bank;

import java.util.ArrayList;


public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    //private ArrayList<Account> myAccounts = new ArrayList<Account>();
    private ArrayList<Account> myAccounts;
    private ArrayList<SavingsAccount> savingsAccounts;
    private ArrayList<CreditAccount> creditAccounts;



    public Customer() {

    }

/*
    public Customer() {
        myAccounts = new ArrayList<Account>();
    }
*/


    public Customer(int customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        myAccounts = new ArrayList<Account>();
        savingsAccounts = new ArrayList<SavingsAccount>();
        creditAccounts = new ArrayList<CreditAccount>();

    }






    public int getCustomerId() {

        return customerId;
    }

    public void setCustomerId(int customerId) {

        this.customerId = customerId;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public ArrayList<Account> getMyAccounts() {

        return myAccounts;
    }

    public void setMyAccounts(ArrayList<Account> myAccounts) {

        this.myAccounts = myAccounts;
    }

    public void addAccount(Account account){

        System.out.println("Adding an account to Customer");
        myAccounts.add(account);
    }


    public void addCreditAccount(CreditAccount creditAccount){

        System.out.println("Adding an CreditAccount to a Customer");
        creditAccounts.add(creditAccount);
    }

    public void addSavingsAccount(SavingsAccount savingAccount){

        System.out.println("Adding an SavingsAccount to a Customer");
        savingsAccounts.add(savingAccount);
    }


    public void printSomething(){

        System.out.println("This is a printout from Customer");
    }

    public ArrayList<SavingsAccount> getSavingsAccounts() {
        return savingsAccounts;
    }

    public void setSavingsAccounts(ArrayList<SavingsAccount> savingsAccounts) {
        this.savingsAccounts = savingsAccounts;
    }

    public ArrayList<CreditAccount> getCreditAccounts() {
        return creditAccounts;
    }

    public void setCreditAccounts(ArrayList<CreditAccount> creditAccounts) {
        this.creditAccounts = creditAccounts;
    }
}
