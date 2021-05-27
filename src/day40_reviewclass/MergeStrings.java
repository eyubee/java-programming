package day40_reviewclass;

public class MergeStrings {
    public static void main(String[] args) {
        /**User is given two Strings, which could vary in length, merge these Strings so these Strings are combined into one String. Any extra characters from mismatched length String are at the end.Ex:String one = abcString two = defghOutput:adbecfgh*/
        System.out.println(MergString("java","is"));

    }
    public static String MergString(String strOne,String strTwo){
        String Merged="";
        int shortString= 0;
        String longString="";
        if (strOne.length() <= strTwo.length()) {
            shortString = strOne.length();
            longString=strTwo;

        } else {
            shortString=strTwo.length();
            longString=strOne;
        }
        for (int i = 0; i < shortString; i++) {
            Merged += ""+strOne.charAt(i) + strTwo.charAt(i);


        }
        Merged=Merged+longString.substring(shortString);
     return Merged;

    }

}
