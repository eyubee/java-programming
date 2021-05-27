package day40_reviewclass;

public class MergeStringsV2 {
    public static void main(String[] args) {
        System.out.println(marge("java","bobfgfh"));

    }
    public static String marge(String str1, String str2){
        String tempMerge="";
        for (int i=0; i<str1.length() || i< str2.length(); i++){
            if (i < str1.length()){
                tempMerge+= str1.charAt(i);

            }
            if (i<str2.length()){
                tempMerge+=str2.charAt(i);
            }
        }
        return tempMerge;
    }
}
