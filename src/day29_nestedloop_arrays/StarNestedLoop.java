package day29_nestedloop_arrays;

public class StarNestedLoop {
    public static void main(String []args){
        //outer loop 1-10
        for (int outer =1; outer <=5;outer++){
            for (int inner =1; inner<=10; inner++){
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int outer = 1; outer<= 10; outer++){
            for (int inner =1; inner<=outer;inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //to print backword
        for (int outer =1; outer <=10; outer++){
            for (int inner =10; inner >=outer;inner--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}