package day49_static;

public class MyBankAccount {
    public static int balance= 500;
    String user;
    public void amount(double amount){
        System.out.println(user+"is spending $ "+ amount);
        balance -=amount;
    }
 public void showBalance(){
     System.out.println("current balance is = "+ balance);

 }


}
