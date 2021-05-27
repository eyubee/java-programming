package day33_arrays;
import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1= 10;
        int num2= 30;
        //swap values with  additional values
        int temp= num1;
        num1=num2;
        num2=temp;
        System.out.println("num1 = "+num1+"\nnum2 = "+num2);

        ///index     0  1 2  3
        int [] nums={5,10,4,100};
        System.out.println("before swap: "+Arrays.toString(nums));
        temp= nums[0];
        nums[0]=nums[3];
        nums[3]=temp;
        temp=nums[1];
        nums[1]=nums[2];
        nums[2]=temp;
        System.out.println("after swap: "+Arrays.toString(nums));
        int [] newNums = {5, 10, 4, 100};
        System.out.println("before swap: "+Arrays.toString(newNums));

        for (int i= 0; i < newNums.length/2; i++){
            int temp2= newNums [i];
            newNums [i] = newNums[newNums.length -1 -i];
            newNums [newNums.length -1 -i]=temp2;
        }
        System.out.println("After: "+ Arrays.toString(newNums));
        //index            0        1        2    3     4
        String [] words= {"java", "html", "js","ruby","css"};
        System.out.println("before reverse words= "+Arrays.toString(words));
        for ( int i= 0,j= words.length-1;i< words.length/2; i++, j-- ){
            String tempWord= words[i];
            words[i]= words[j];
            words[j]=tempWord;
        }
        System.out.println("after reverse word= "+Arrays.toString(words));


String sentance= "i love java";
String []sentenceSplit= sentance.split(" ");
for (int i= sentenceSplit.length-1;i>=0;i--) {

    System.out.print(sentenceSplit[i]+" ");

}
    }
}
