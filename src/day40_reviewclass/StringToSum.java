package day40_reviewclass;

public class StringToSum {
    public static void main(String[] args) {
        System.out.println(getSum("a5bc12def100"));
        /**[Sum of Numbers from String]
         Create a method that will accept a String and returns the sum of all the numbers in the String.
         Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
         Ex: a5bc12def100g  Here we would have added 5 + 12 + 100
         NOT: 5 + 1 + 2 + 1 + 0 + 0*/

    }
    public static int getSum (String str){
        int sum=0;
        String num="";
        for (int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){//cheks if every char is a number (digit)
              num+=str.charAt(i);
                if(i==str.length()-1 ||!Character.isDigit(str.charAt(i+1))){
                    /**check if the last char is -1 length first if not it will be out of bound */
                    sum+=Integer.parseInt(num);
                    num="";//reset  our string for the number
                }
            }
        }
        return sum;
    }

}
