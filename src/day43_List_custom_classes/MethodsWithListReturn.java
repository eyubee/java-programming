package day43_List_custom_classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
       // System.out.println( System.nanoTime());
        //to find out how long it took to run
        long start= System.nanoTime();
       List<Integer> milNums= getIntegerList();//returns ready arraylist object
       // System.out.print (milNums);
        long end= System.nanoTime();
        System.out.println("how long it took with list "+(end-start));
        long startArray =System.nanoTime();
        int [] milArrays= getIntArray();
      //  System.out.println(Arrays.toString(milArrays));
        long endArrays=System.nanoTime();
        System.out.println("how long array took to run "+(endArrays-startArray));

    }
    /**getIntergerList....return List<Interger>
     * loop 0 to 1000_000*/
    public static List<Integer> getIntegerList (){
        List<Integer> nums= new ArrayList<>();
        for (int i=0; i<=1000_000; i++){
            nums.add(i);
        }
        return nums;
    }
/**getIntergerArray....return array<int>
 * loop 0 to 1000_000*/

public static int[] getIntArray (){
    int [] nums= new int [1000_001];

    for (int i=0; i<=1000_000; i++){
        nums[i]=i;
    }
    return nums;
}
/**getDays */
}