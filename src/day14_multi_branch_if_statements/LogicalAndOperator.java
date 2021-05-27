package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main (String[]args){
        System.out.println(true&&true);
        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);
        System.out.println(10 > 5 && 1==1);
        System.out.println(5>2 && 2>5);
        int apples =10, oragges =5;
        boolean check= apples>5 && oragges>3;
        System.out.println("check= "+check);
        if (apples >6 && oragges >2){
            System.out.println("enough apples and oranges");
        }else {
            System.out.println("go to the store to buy more");
        }
    }
}
