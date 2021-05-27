package day25_loops;

public class PrintingStarts {
    public static void main(String[] args) {
        for (int stars=1 ; stars <=15; stars ++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars="";
        for (int n = 1;n <=5; n++){
            myStars+="* " ;
        }
        System.out.print("my starts = "+myStars);



    }
}
