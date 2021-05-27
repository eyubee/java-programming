package day25_loops;
import java.util.*;

public class WhileHungry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isHungry= true;
        int conuntToFull=3;
        while (isHungry =true){
            int bananas= scan.nextInt();
            System.out.println("eat "+bananas+" banana");
            if (bananas==conuntToFull){
                System.out.println(isHungry=false);
            }else if (bananas<conuntToFull){
                bananas++;
                System.out.println("eat till you are full");
            }
        }

    }
}
