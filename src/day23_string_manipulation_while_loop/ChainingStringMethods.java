package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word ="wooden spoon";
        System.out.println(word.toUpperCase( ).toLowerCase( ).length());
        //remove space first then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase( ));
        String city= "chicago";
        //to change city to Chicago
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        //change to atl



    }
}
