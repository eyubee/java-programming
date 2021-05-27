package day38_methods;

public class ArraysUtils {
    public static void main(String[] args) {


    }
    public static void  PrintArray (int []nums){
        for (int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int sum(int []nums){
       int sumNum=0;
       for(int each:nums ){
           sumNum+=each;

       }
        return sumNum;
    }
    public static boolean contains(int []nums, int num){
        for(int eachnum:nums){
            if (eachnum==num){
             return true;

            }
        }
        return false;

    }

}
