package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city= "Atlanta";
        //equals case sensative
        System.out.println(city.equals("atlanta"));//false
        System.out.println(city.equals("Atlanta"));//true
        System.out.println(city.equals("ATLANTA"));//false
        //equalIsIgnoreCase not case sensative
        System.out.println(city.equalsIgnoreCase("atlanta"));
        System.out.println(city.equalsIgnoreCase("Atlanta"));
        System.out.println(city.equalsIgnoreCase("ATLANTA"));

    }
}
