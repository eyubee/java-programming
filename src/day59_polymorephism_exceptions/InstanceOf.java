package day59_polymorephism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Triangle;

import java.awt.*;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape= new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Triangle);//false
        if(shape instanceof Circle){
            System.out.println("it is a circle object ");
        }else if(shape instanceof Triangle ){
            System.out.println("it is a triangle object");
        }
        /** java reflection API */
        System.out.println(shape.getClass().getSimpleName());//just class name of object
        System.out.println(shape.getClass().getName());//class name of object and package name
        if(shape.getClass().getSimpleName().equals("Circle")){
            System.out.println("it is a circle shape");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);
        WebElement el= new Link();
        System.out.println("object class name of el variable= "+ el.getClass().getCanonicalName());
    }
}
