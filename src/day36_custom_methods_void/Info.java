package day36_custom_methods_void;
import java.util.Random;
public class Info {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(gerArge());
        System.out.println("birth year ="+getRandomYear());
        if(isMarried()){
            System.out.println("married");
        }else {
            System.out.println("single");
        }

    }
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int gerArge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random=new Random();
        int randomYear=random.nextInt(2021);
        return randomYear;
    }
}
