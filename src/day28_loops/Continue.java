package day28_loops;

public class Continue {
    public static void main(String[] args) {
        for (int n= 1; n<=5; n++){
            System.out.print(n);
            if(n==4){
               // System.out.println(n);
                break;
            }

        }
        System.out.println();
        for (int j=1; j<=5;j++){
            if (j==2 || j== 4){
                continue;
            }
            System.out.print(j);
        }
    }
}
