package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source= "AVVSDVHSGDHDHGDHGJGJSDGJGSDJGSJGSJDGsjkdajhsdjagdgajdshghjagsdhjgz019329823982_!$$@3";
        Random random= new Random();
        String password="";
        for (int i=1; i<= 8; i++){
        System.out.println(random.nextInt(source.length()));
            int index= random.nextInt(71);
            //add the char to password variable using +=
            password+= index;//or
            //password= password+ source.charAt(index); or
            //source.substring (index, index +1)
            System.out.println(index);


        }
        System.out.println("password "+password);
    }

}
