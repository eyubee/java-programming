package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount();
        checking.setType("saving");
        System.out.println("account type = " + checking.getType());
       checking.setBalance(260008898);
        System.out.println("account balance = " + checking.getBalance());
        checking.setAccountNumber(634762344);
        System.out.println("account number = " + checking.getAccountNumber());
        checking.setAccountHolder("Eyerusalem tefera");
        System.out.println("caccount holder = " + checking.getAccountHolder());
        System.out.println(checking);
    }
}
