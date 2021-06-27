package day56_abstraction.driveable;

import day56_abstraction.Greeting;

public class Tesla extends  Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("tesla costs "+ (mile * .10)+" to drive "+ mile+ " miles");
    }

    @Override
    public void autoDrive() {

    }

    @Override
    public void hi() {

    }

    @Override
    public void bye() {

    }
}
