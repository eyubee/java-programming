package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double selesAmount = 500.55;
        double bouns = 0.0;
        if (selesAmount <= 1000) {
            System.out.println("Good job, you qualify for bouns!");
            bouns = 50.0;

        } else {
            System.out.println("Good job, you qualify for full bouns! $");
            bouns = 100;
        }
        System.out.println("your total bouns is $" + bouns);
    }
}
