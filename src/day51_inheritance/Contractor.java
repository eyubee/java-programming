package day51_inheritance;

public class Contractor extends Employee {
    @Override
    public double calculateSalary(double hourlyRate){
        double annualSalary= hourlyRate * 50*40;
        return annualSalary;

    }

}
