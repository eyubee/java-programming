package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name="Eyerus";
        p1.age= 31;
        p1.tak();
        p1.walk();
        p1.work("SDET");
        Teacher t1= new Teacher();
        t1.name= "bob";
        t1.teacherID= 123;
        t1.age= 150;
        t1.tak();
        t1.teach("java");

    }
}
