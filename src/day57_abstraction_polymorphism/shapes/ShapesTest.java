package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
triangle.draw();
Shape circle= new Circle();
circle.draw();
        List<Shape> shapesList= new ArrayList<>();
        shapesList.add(circle);
        shapesList.add(triangle);
        shapesList.add(new Triangle());
        shapesList.add(new Circle());
       // System.out.println("shapesList = " + shapesList);    //hashcode
        for(Shape eachShape: shapesList){
            eachShape.draw();
        }
        drawashape(new Circle());
        drawashape(new Triangle());
    }
    /**static method: drawshape
     * accepts object of shape
     * then calls draw() method*/
    public static void drawashape(Circle shape){
        System.out.println("----drawing circle----");
        shape.draw();
    }

    public static void drawashape(Triangle shape){
        System.out.println("----drawing triangle ----");
        shape.draw();
    }

}
