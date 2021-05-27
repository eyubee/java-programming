package day37_methods_overloading;

public class MethodPractics {
    public static void main(String[] args) {
        System.out.println(repeating("java",3,'|'));

    }
    public static String repeating (String word, int times, char delimiter){
       String repeatWord="";
        for (int i=0; i<=times; i++){

            /** TO REMOVE THE LAST |*/
            if (i==times){
                repeatWord+=word;//add only word by itself without delimter
            }else{
                repeatWord+=word+""+delimiter ;
            }
        }
        return repeatWord;
    }
}
