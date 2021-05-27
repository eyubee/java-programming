package day36_custom_methods_void;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(800);
        System.out.println(getCreditScore());
        int score= getCreditScore();
        System.out.println(score);

    }
    public static void checkEligible( int creditScore){
        if(creditScore >=700){
            System.out.println("you are eligiable for leasing this car");
        }else {
            System.out.println("sorry, you aren't eligiable this time");
        }

    }
    public static int getCreditScore(){
        return 800;
    }
}
