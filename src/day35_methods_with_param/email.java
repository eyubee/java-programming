package day35_methods_with_param;

import java.util.Locale;

public class email {
    public static void main(String[] args) {
buildEmail("eyu", "bright");
    }
    public static void buildEmail( String name, String domain){
        name= name.replace(" ","_").toLowerCase();
      String  email= name+"@"+domain+".com";

        System.out.println(email);


    }
}
