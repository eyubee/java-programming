package day10_shorthand_operator;

public class ChangeVariableValue {
    public static void main (String[]args){
        int count =3;
        count= count+10;
        System.out.println(count);
        int apple=200;
        System.out.println("addtion "+apple);
        apple=apple-15;
        System.out.println("subtraction "+apple);
        apple=apple/3;
        System.out.println("division "+apple);
        apple=apple*2;
        System.out.println("mulitiplication "+apple);
        apple= apple%100;//keep whole just give me the remainder
        System.out.println("remning "+apple);

    }
}
