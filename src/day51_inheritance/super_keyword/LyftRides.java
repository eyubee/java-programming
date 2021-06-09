package day51_inheritance.super_keyword;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyft= new Lyft();
        System.out.println("total at 4.50 = " + lyft.calculateRate(5));
        LyftXL lyftXLRide= new LyftXL();
        System.out.println("total at 4.50 = "  + lyftXLRide.calculateRate(5));
        Lux luxRide= new Lux();
        System.out.println("total at 4.50 = " + luxRide.calculateRate(5));
    }
}
