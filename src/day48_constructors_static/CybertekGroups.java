package day48_constructors_static;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CybertekGroups {
    public static void main(String[] args) {
//        Scanner scan =new Scanner(System.in);
        Group group1= new Group("Debuggers");
//print size of members
        System.out.println(group1.getMemebers().size());
        group1.addMemeber("eyu");
        group1.addMemeber("james");
        System.out.println(group1.getMemebers().size());

        Group group2= new Group("Winners");
        group2.setMemebers(Arrays.asList("james", "bob","cat","rat","flat"));
        //print all members without using toString
        System.out.println("group2 memebers = "+ group2.getMemebers());
        //use if statments if cat is in the group
       if(group2.getMemebers().contains("cat")){
           System.out.println("cat is a member of group2");
       }else{
           System.out.println("cat isn't a member of group2");
       }

    }
}
