package day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String name= "Eyerusalem amdeberhan tefera";
        System.out.println(name.length());
        System.out.println("name.length() = " + name.length());
        System.out.println("first name "+"eyerusalem".length());
        int count= name.length( );
        System.out.println("count = "+count);
        String password ="abc12"; //password needs to be at least 6 charcater
        if (password.length() >=6){
            System.out.println("password is valid");
        }else {
            System.out.println("password is too short");
        }
    }
}
