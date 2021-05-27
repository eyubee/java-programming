package replit;
import java.util.*;

public class frontArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();


        }
        //WRITE YOUR CODE HERE
  int newArray []={0,0};
        if(size>=2){
                newArray=new int[]{num[0],num[1]};

        } else {
            newArray= new int[]{num[0]};
        }
        System.out.println(Arrays.toString(newArray));
        int[] nums = new int[size];
        int [] newArray2 = new int[size*2];


        newArray [newArray2.length-1]=nums[nums.length-1];
        System.out.println(Arrays.toString(newArray2));



    }
}
