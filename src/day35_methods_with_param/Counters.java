package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        ecount(5);
        printAge(1990);


    }
    public static void ecount (int num){
        for (int i =0; i<= num; i++)
            System.out.print(i +" ");

    }
    public static void printAge( int year){
        int birthyear= 2021-year;
        System.out.println(birthyear);
    }
}
