package replit;

public class PrefixAgain {
    public static void main(String[] args) {/**Given a String str and a number n
     check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.

        Assume that the String is not empty and that n is in the range from 1 to str.length().*/
    String str="abXYabc";
    int n=1;
    String prefix=str.substring(0,n);
    String renaming =str.substring(n);
        System.out.println(renaming.contains(prefix));


       System.out.println(str.substring(n) );

    }

}
