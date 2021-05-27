package day45_oop;

public class TrafficLight {
    String color;
    public void  showColor (){//read only color
        System.out.println("current color ="+ color);
    }
    public void changeColor( String newColor){//updates the value of color
        System.out.println("changing color to "+newColor);
        color = newColor;
        if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") || newColor.equalsIgnoreCase("green")){

        }else{
            System.out.println("invalid color: "+ newColor);
            newColor=color;
        }
    }
}
