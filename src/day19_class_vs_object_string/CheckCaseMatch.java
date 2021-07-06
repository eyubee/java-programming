package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode= "usa";
        //to check if the countrycode is all caps
        if( countryCode.equals(countryCode.toUpperCase( ))){
            System.out.println(countryCode+" is correct format");
        }else {
            System.out.println(countryCode+" is wrong format");
        }
        if (countryCode.equals(countryCode.toLowerCase())){

          System.out.println(countryCode+" is correct format");
    }  else {
        System.out.println(countryCode+" is wrong format");
    }
    }
}
