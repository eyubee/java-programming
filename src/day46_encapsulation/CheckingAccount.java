package day46_encapsulation;

public class CheckingAccount {
    private int balance;
    private double accountNumber;
    private String accountHolder;
    private String type;

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public int getBalance() {
        return balance;

    }

    public void setAccountNumber(double accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public void setAccountInfo(long accountNumber, String accountHolder, int balance, String type){
        this.accountNumber=accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.type = type;
    }

}
