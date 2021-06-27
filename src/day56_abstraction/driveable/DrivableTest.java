package day56_abstraction.driveable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla modle3= new Tesla();
        modle3.autoDrive();
        modle3.transportPeople();
        modle3.cost(20);
        modle3.hi();
        modle3.bye();
        Plane plane= new Plane();
        plane.transportPeople();
        plane.autoDrive();
        plane.hi();
        plane.cost(200);
    }
}
