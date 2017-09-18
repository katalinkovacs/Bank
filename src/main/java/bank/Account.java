package bank;


public abstract class Account {

    private int balance;

    public Account() {

    }

    public Account(int balance) {

        this.balance = balance;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public String printHello(){

        return "hello from Account";
    }




}
