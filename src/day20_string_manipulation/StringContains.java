package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company= "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains(" "));
        if (company.contains(" ")){
            System.out.println("multiple words company name");
        }else {
            System.out.println("single word company name");
        }
        String etsyTitile ="Wooden sppon | Etsy";
        if (etsyTitile .contains("Wooden sppon | Etsy")){
            System.out.println("pass - title check passed");
        }else {
            System.out.println("file - title check failed");}
        String name= "eyerusalem";
        if (name.contains("a")&& name.contains("e")){
            System.out.println("first name has a and e at the same time ");
        }else {
            System.out.println("name doesn't contain a and e at the same tme ");
        }
        String email = "teferaey@gmail.com";
        if (email.contains("@")&&email.endsWith(".com")){
            System.out.println("info is email");
        }else {
            System.out.println("info isn't email");
        }
        if (email.toLowerCase().contains("e")){
            System.out.println("e is present");
        } else {
            System.out.println("e isn't present");
        }
     }
}
