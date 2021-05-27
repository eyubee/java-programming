package day18_conditions_strings_intro;

public class Athentication {
    public static void main(String[] args) {
        int last4SSN = 1223;
        int pinCode = 2341;
        int expLast4SSN = 1223;
        int expPinCode = 2245;
        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful ");
        }else {
            System.out.println("Authentication unsuccessful");
            if(last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
            }if (expPinCode != pinCode) {
                    System.out.println("Pin Code is incorrect");
                }

        }
    }
}


