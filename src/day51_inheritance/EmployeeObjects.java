package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee emplyee= new Employee();
        emplyee.joTitile= "programmer";
        System.out.println("emplyee Salary = " + emplyee.calculateSalary(85));
        double annualProgSalary= emplyee.calculateSalary(65);
        System.out.println("annual salary = "+Math.round(annualProgSalary));
        System.out.println("emplyee.toString() = " + emplyee.toString());
        Contractor sdetContractor= new Contractor();
        sdetContractor.joTitile= "sdet";
        System.out.println("annual salary = " + sdetContractor.calculateSalary(85));
        System.out.println("sdetContractor = " + sdetContractor);


    }
}
