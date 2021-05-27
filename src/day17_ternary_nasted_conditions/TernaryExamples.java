package day17_ternary_nasted_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        String result="good";
        int score1 =90;
        if (score1 >60 ){
            result="pass";
            System.out.println("pass");
        }else if (score1 <60){
         result = "fail";
        System.out.println("fail");}

        //with ternary
        String result1 =(score1>66)?"pass" :"fail";

        String quality ="bad";
        int rate =quality.equals("good")? 100: 0;
        System.out.println(quality.equals("good")?100:0);//if it was good, we get print out of 100
        System.out.println("rating = "+rate);
        int score3=100;
        char grade = score3>90 ?'A':'B';
        grade=score3>=90 ?'a':'b';
        System.out.println("Grade = "+grade);
    }
}
