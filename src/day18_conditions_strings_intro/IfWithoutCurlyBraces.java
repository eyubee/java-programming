package day18_conditions_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass= "python";
        if (todayClass.equals("java"))
            System.out.println("java is fun");
        //without {{ }} we can only have one codition per if or else
        else
            System.out.println("it isn't java it is "+todayClass);
        int score =1;
        if (score==1)
            System.out.println("lowest score is 1");
        else if (score==3)
            System.out.println("highest score is 3");
        else
            System.out.println("invalid score");

        if (score>1)
            System.out.println("condition not met");
        System.out.println("not gonna work");///this part will get printted all the time


    }
}
