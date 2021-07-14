package day61_exceptions_collections;

import java.util.ArrayList;
import java.util.List;

public class ErrorExamples {
    /**normally, we don't catch this kind of error because it is a java exception */
    public static void main(String[] args) {
        //how to write a code for stackOverFlowError
        try {
            myMethosd();

        } catch (StackOverflowError error) {
            System.out.println("after error");
        }
        //OutOfMemoryError
        List<Integer> nums= new ArrayList<>();
        while (true){
            nums.add(100);
        }
    }
static int counter=0;
    public static void myMethosd() {
        System.out.println(counter++);
        myMethosd();
    }
}