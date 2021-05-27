package day26_loops_more;

public class MultiplicationTable {
    public static void main(String[] args) {
int j= 1;
        if (j<1 || j >12){
            System.out.println("error: invalid number ");
        return;}

       for (int i=1;i<=12;i++){
           System.out.println(j+"x"+i+" = "+j*i);



       }

    }
}
