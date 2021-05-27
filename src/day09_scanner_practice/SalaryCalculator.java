package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        double hourlypay= scan.nextDouble();
        double workedHrs= scan.nextDouble();
        double weeklyPay= hourlypay * workedHrs;
        double Tax=hourlypay*workedHrs-(hourlypay*workedHrs*.25);
        System.out.println("weekly pay is: "+weeklyPay);
        double monthlyPay = weeklyPay*52/12;
        System.out.println("monthly pay is: "+monthlyPay);
        double annualPay = monthlyPay*12;
        System.out.println("Anually pay is: "+annualPay);

        System.out.println(weeklyPay);


    }    //hr rate= 50 calculate weeklypay, monthlypay, annualpay 40 hrs a week}
}
