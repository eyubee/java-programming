package day18_conditions_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
         int score = 40;
         if (score >=1 && score <=40 ){
             System.out.println(score+" is grade D " );
         } else if (score >=41 && score <=60){
             System.out.println(score+" is grade C");
         }else if (score >= 61 && score <=90 ) {
             System.out.println(score+" is grade B");
         }else if (score<= 91 &&score >=100){
             System.out.println(score+" is grade A");
        } else {
             System.out.println("invalid score");
         }
    }
}
