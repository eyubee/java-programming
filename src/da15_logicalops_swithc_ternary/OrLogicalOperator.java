package da15_logicalops_swithc_ternary;

public class OrLogicalOperator {
    public static void main(String[] args){
        System.out.println("true || true =" + (true || true));
        System.out.println("true || false =" + (true || false));
        System.out.println("false || true =" + (false || true));
        System.out.println("false || false =" + (false || false));
        System.out.println("false | false =" + (false | false));
        System.out.println("false | true =" + (false | true));
        int apples = 5;
        int oranges= 7;
        System.out.println(apples > 3 || oranges > 4);
        System.out.println(apples > 3 || oranges < 4);
        System.out.println(apples < 3 || oranges > 4);
        System.out.println(apples < 3 || oranges < 4);
        if (apples >3 || oranges >4){
            System.out.println("no need to go to the store");
        }else{
            System.out.println("go to the store to buy more fruits");
        }
        if (apples < 3 || oranges < 4){
            System.out.println("no need to go to the store");
        }else{
            System.out.println("go to the store to buy more fruits");}


    }
}
