package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1= new StaticBlockDemo();//static initializer and constructor(10+5)
        StaticBlockDemo st2= new StaticBlockDemo();//constructor (15+5)
        StaticBlockDemo st3= new StaticBlockDemo();//constructor (20+5) each constructor adds 5
        System.out.println(StaticBlockDemo.num);

    }
}
