package day53_inhertiance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME="change"; Error can't change the value of final variable
        final int SSN= 123456789;
       // SSN=123; error
    }
}
