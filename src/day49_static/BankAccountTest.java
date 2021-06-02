package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        MyBankAccount dad= new MyBankAccount();
        dad.user="bobcat";
        dad.showBalance();//500
        dad.amount(200);
        dad.showBalance();
        MyBankAccount me= new MyBankAccount();
        me.user= "newMeme";
        me.showBalance();
    }
}
