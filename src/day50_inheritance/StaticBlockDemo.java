package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;
    static List<String> carModels;
    static {
        System.out.println("static initializer block");
        num = 10;
        carModels= new ArrayList<>();
        carModels.addAll(Arrays.asList("Toyota", "Honda","lexus"));

    }
    {
//initializer block...runs each time objevt is created, before construcator
        System.out.println("initializer block");
    }
    public StaticBlockDemo(){
        System.out.println("constructor method");
        num +=5;

    }
    public StaticBlockDemo(int value){
        System.out.println("overloaded constructor -value = "+ value);
        num =num+value;
    }
}
