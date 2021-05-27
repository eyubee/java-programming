package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word="java";
        String [] wordSplit= word.split("a");
        System.out.println(Arrays.toString(wordSplit));
        String  word2= "java1sqlhtml";
        String [] strArr= word2.split("\\d");
        System.out.println(Arrays.toString(strArr));
 //is password matching the requirement set
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")){
            System.out.println("valid password ");
        }else {
            System.out.println("invalid password");
        }
    }
}
