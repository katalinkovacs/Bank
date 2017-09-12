package bank;


public class CreditAccount extends Account{

    private int creditLimit;

    public CreditAccount() {

    }

    public CreditAccount(int balance, int creditLimit) {
        super( balance);
        this.creditLimit = creditLimit;
    }



    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }


}
