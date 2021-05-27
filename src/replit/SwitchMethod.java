package replit;
import java.util.*;

public class SwitchMethod {
    public static void main(String[] args) {

        int [] arr= {1,2,3,4};
        Arrays.toString(do_switch(arr));


        }
    public static int[] do_switch(int[] i){
        int last=i[i.length-1];
        i[i.length-1]=i[0];
        i[0]=last;
        System.out.println(Arrays.toString(i));
        return i;
    }


}


