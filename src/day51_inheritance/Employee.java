package day51_inheritance;

public class Employee {
    String joTitile;
    public double calculateSalary(double hourlyRate){
        double annualSalary= hourlyRate * 52*40+(hourlyRate*52*40*.10);
        return annualSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "joTitile='" + joTitile + '\'' +
                '}';
    }
}
