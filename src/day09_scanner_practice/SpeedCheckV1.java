package day09_scanner_practice;


public class SpeedCheckV1 {
    public static void main (String[]args){
        //speed limit 55, currentspeed---75, ovrethelimit cuurentspped-sppedlimit
        int speedLimit= 55;
        int currentSpeed= 75;
        int overTheLimit=currentSpeed-speedLimit;
        System.out.println("you are driving "+overTheLimit+" mps over the spped limit");


    }
}
