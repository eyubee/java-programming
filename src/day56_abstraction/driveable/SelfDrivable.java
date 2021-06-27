package day56_abstraction.driveable;

public interface SelfDrivable {
    void autoDrive();
   // void selfPark(); this wil give us an error unless we implement override on the other two sub classes work around
    public default  void selfPark(){
        //since the method is defult no need to do implementation
        System.out.println("new method without breaking the implementation ");
    }
}
