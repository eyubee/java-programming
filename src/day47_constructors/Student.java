package day47_constructors;

public class Student {
    private String name;

    public Student(){
        System.out.println("no-args constructor");
    }
    public Student(String name){
        System.out.println("name param constructor | name= "+name);

    }
public Student(int age){
    System.out.println("age parm constarctor| age ="+age);
}
public Student(String name, int age){
    System.out.println("name and age parm constractor ="+ name +" ,"+age);
}
//    private int age;
//    private char;
//    private String university;
//    public void setName(String name){
//        this.name=name;
  //  }
}
