package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city= "atlanta";
        if (city.equals("la")){
            System.out.println("welcome to ATL" );
        }
        else {
            System.out.println("not ATL");
        }
        String weather ="sunny";
        if (weather.equals("sunny"))
            System.out.println("it is beautiful outside lets go out code jave!");
        else{
            System.out.println("stay home, lets code java!!");
        }
    }
}
