package day33_arrays;
import java.util.*;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String [][] users= new String [3][2];//first [] is how may array we have and the second [] is how many info in one array
        users[0][0]="amde ";
        users [0][1]="1234ffgd";
        users [1][0]="eyu";
        users [1][1]="54889qgdhsagd";
        users[2][0]="jos";
        users[2][1]="jdajdk233";
        String [][]anotherWayUsers={{"amde","1234ffgd"},{"eyu","54889qgdhsagd"},{"jos","jdajdk233"}};

        //to get the names

        System.out.println(anotherWayUsers[0][0]);
        System.out.println(anotherWayUsers[1][0]);
        System.out.println(anotherWayUsers[2][0]);
      // to get the passwords
        System.out.println(anotherWayUsers[0][1]);
        System.out.println(anotherWayUsers[1][1]);
        System.out.println(anotherWayUsers[2][1]);
        System.out.println(Arrays.deepToString(anotherWayUsers));
    }

}
