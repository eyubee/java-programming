package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[]args) {
        if (10>5) {
            System.out.println("condition is true");
        }//{} everything inside is called if statment body
        else{
            System.out.println("condition is false");
        }//everything inside {} is the else statment body
        int count =25;
        //check if count is more than 30 if yes print count is more than 30 if not print count is less than 30
        if (count >30 ){
            System.out.println("count is more than 30");
        }
        else {
            System.out.println("count is less than 30");
        }
        byte age =25;
        if (age >= 18){
            System.out.println("Eligible to vote ");
            System.out.print("age is greater or equal to 18");
        }else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }
    }
}
