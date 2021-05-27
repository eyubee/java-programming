package day07_aritmetic_operators_casting;

public class DivisionProblem {
    public static void main (String[]args){
        System.out.println(10/3);
        System.out.println(5/2);
        System.out.println(5.0/2);//if any of the number has .0 (double or float), the result
        // will return deciamal as well
        int count= 100;
        double dcount=30.0;
        System.out.println(count/dcount);
    }
}
