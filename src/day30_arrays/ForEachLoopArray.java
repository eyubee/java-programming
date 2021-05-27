package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] data= {33, 44,66,77, 990,55, 99,11, 5,1 };
        for(int eachNum : data){
            System.out.print(eachNum+" ");
        }
        System.out.println();
       for (int i=0; i< data.length; i++) {
           System.out.print(data[i]+" ");
       }
        System.out.println();

       //to print the last value of the array
        System.out.println("last value printout "+data[data.length-1]);
        //to print all numbers backwords in the same line
        for( int indexbackword= data.length-1; indexbackword>=0; indexbackword--){
            System.out.print(data[indexbackword]+" ");
        }
        System.out.println(data.length);
    }
}
