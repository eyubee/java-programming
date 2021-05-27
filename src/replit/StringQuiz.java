package replit;

public class StringQuiz {
    public static void main(String[] args) {
       String ta="a";
       ta=ta+"b";
        System.out.println(ta);
       String tb= "c";
       ta=ta+tb;
        System.out.println(ta);
       ta.replace('c','d');
        System.out.println(ta);
        String str ="  Batch 22  ";
        str.trim();
        int z= str.trim().length();
        System.out.println(z);
        String str1= "java";
        String str2= new String("Java");
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("equals");
        } else {
            System.out.println("not equal" );
        }
        String s1= "wooden spoon";
        String s2= s1.substring(s1.indexOf("s"));
        System.out.println(s2);
        String test ="hello world";
        test.trim();
        int g= test.indexOf(" ");
        System.out.println(g);
    }
}
