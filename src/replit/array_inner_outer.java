package replit;
import java.util.*;

public class array_inner_outer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for (int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for (int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        int counter = 0;
        int innerSize =inner.length;

        for (int innerEach : inner) {
            for (int outerEach : outer) {
                if (outerEach == innerEach) {
                    counter++;
                }
            }

        }
        System.out.println(counter == innerSize);
    }
}
