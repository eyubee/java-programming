package day58_polymorphis;

public class Casting  {
    public static void main(String[] args) {
        //variable of worker and object of superMan
        Worker worker= new SuperMan();
        worker.work("QA");
        worker.getPaid();
        ((Father)worker).raiseKed();//downcasting
        ((SuperMan)worker).playWithKid();
        /**downcasting from worker to superman */
        SuperMan superMan= (SuperMan) worker;

    }
}
