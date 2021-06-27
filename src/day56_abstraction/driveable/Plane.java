package day56_abstraction.driveable;

import day56_abstraction.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoDrive() {

    }

    @Override
    public void transportPeople() {
        System.out.println("flying people");

    }

    @Override
    public void cost(int mile) {
        System.out.println("plane costs "+ (mile * 26)+" to drive "+ mile+ " miles");
    }

    @Override
    public void hi() {

    }

    @Override
    public void bye() {

    }
}
