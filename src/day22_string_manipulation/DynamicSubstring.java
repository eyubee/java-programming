package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        //index + substring
        String result= "result count: 12345";
        System.out.println(result.substring(13));//to print just 12345
        System.out.println(result.indexOf(":"));
        int colonIndex= result.indexOf(":");//finding index of :
        System.out.println(result.substring(colonIndex+1));//+1 is to remove :
        System.out.println(result.substring(result.indexOf(":")+1));//combine two statatment
        String today= "i learned [java] today";
        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));
        System.out.println(today.substring(11,15));
        System.out.println(today.substring(today.indexOf("[")+1));
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));//prints only java
    }
}
