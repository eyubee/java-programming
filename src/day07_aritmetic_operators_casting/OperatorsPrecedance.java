package day07_aritmetic_operators_casting;

public class OperatorsPrecedance {

    public static void main(String[] args)
    {
            System.out.println(10+5);
           System.out.println(10+5-3);//12
        System.out.println(10-5+3);//8
        System.out.println(10-(5+3));//2
        System.out.println(2*3); //6
        System.out.println(2* 3/3);//2
        //System.out.println(10/0);// number can't be devided by 0 error while code is running
        System.out.println(0/10);
        System.out.println(10/3);//java just returns 3 and removes the reminder
        System.out.println(10.0/3.0);




    }
}
