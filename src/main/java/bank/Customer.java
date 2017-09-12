package bank;

import java.util.ArrayList;


public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    //private ArrayList<Account> myAccounts = new ArrayList<Account>();
    private ArrayList<Account> myAccounts;


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
        //myAccounts = new ArrayList<Account>();
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
        myAccounts.add(account);
    }
}
