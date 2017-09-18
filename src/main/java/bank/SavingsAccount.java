package bank;


public class SavingsAccount extends Account {

    private int interest;


    public SavingsAccount( int balance, int interest) {
        super(balance);
        this.interest = interest;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }


    public String printHello(){

        return "hello from SavingsAccount";
    }
}
