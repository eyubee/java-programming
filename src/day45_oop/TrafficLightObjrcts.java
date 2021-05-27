package day45_oop;

public class TrafficLightObjrcts {
    //create traffic light object
    public static void main(String[] args) {
        TrafficLight trafficLight= new TrafficLight();
//        trafficLight.color= "red";   can create it this way BAD PRACTICE
        trafficLight.changeColor("red");
        trafficLight.showColor();
        trafficLight.changeColor("green");
        trafficLight.showColor();
        trafficLight.changeColor("yellow");
        trafficLight.showColor();
    }
}
