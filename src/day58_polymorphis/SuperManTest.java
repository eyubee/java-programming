package day58_polymorphis;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKed();
        //spMan1.work("sdet");//ERROR spMan1 is father type can only access methods in father
        Worker spMan2= new SuperMan();
        spMan2.work("SDET");
    }
}
