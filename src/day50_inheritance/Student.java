package day50_inheritance;

public class Student extends Person{

    String schoolName;
    String stuName;
    public void stundetInfo(){
        System.out.println("student name is "+stuName);
        System.out.println("teacher name is "+name);
        System.out.println(stuName+" is studying at "+ schoolName);
    }
}

