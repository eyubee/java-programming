package day07_aritmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
        int java1=3;
        int java2=5;
//since the string was first, it automatically changes the other data into string
        System.out.println("Jave"+java1+java2);//java35
        System.out.println("java"+5+3);//java53
        System.out.println("java"+(5+3)); //java8
        //since jave goes from left to right, java calculates addition first
        System.out.println(5+3+ "java"); //8java
        //in the next print, just like math the data in the () will get aculated together so we get 53 java
        System.out.println(5+ (3 +"java"));//53java
        String str1="hello";
        String str2= "friends";
        System.out.println(str1+str2);
        System.out.println(str1+" "+str2);
        int num1=7;
        int num2=8;
        System.out.println(num1+num2);
        //to print 7 8
        System.out.println(num1+" "+num2);

        //print78
        System.out.println(num1+""+num2);
        char char1='a';
        char char2='b';
        System.out.println(char1+char2); //195
        System.out.println(char1+""+char2);//ab

    }
}
