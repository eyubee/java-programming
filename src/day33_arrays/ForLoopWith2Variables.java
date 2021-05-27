package day33_arrays;

public class ForLoopWith2Variables {
    public static void main(String[] args) {
        for (int i=1,j=1;i<=4; i++,j++){
            System.out.println("i= "+i+", j= "+j);//both j and i are the same value they are going fowrword or one direction
        }
        System.out.println("---opposite 2 way loop");
        for( int i=1, j=5;j>=0;i++,j--){//one value is dicreasing and the other value is increasing
            System.out.println("i= "+i+", j= "+j);
        }
    }
}
