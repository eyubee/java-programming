package day38_methods;

import java.util.*;

public class StringsUtiles {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("hola"));
        String word=null;
       // System.out.println(word.toUpperCase(Locale.ROOT));

    }
    public static boolean isNullOrEmpty(String str){
       return str== null || str.isEmpty();
//        if(str== null || str.isEmpty()){
//            return true;
//        }
//        return false;
    }
    public static boolean  IsPalidrom(String str){
        str=str.toLowerCase();
    for(int i=0; i<=str.length()/2; i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i))
        {
            return false;
        }
    }
return true;
    }
 public static String reverse (String str){
        String reversedStr="";
for (int i=str.length()-1; i>=0;i--){
    reversedStr+=str.charAt(i);
}
  return ""+reversedStr;
 }

}
