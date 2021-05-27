package replit;
import java.util.Scanner;
public class seniorCitozens {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens= scan.nextInt();
        int nonSeniorCitizens= scan.nextInt();
        int age= scan.nextInt();
        System.out.println("What is new citizen's age?");
        if (age >= 65) {
            seniorCitizens=seniorCitizens+1;
            System.out.println("Senior Citizen\nNew seniorCitizens count "+seniorCitizens);
            System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);
        } else {
            nonSeniorCitizens=nonSeniorCitizens+1;
            System.out.println("Non-Senior Citizen");
            System.out.println("New seniorCitizens count "+seniorCitizens);
            System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);

        }
    }
}
