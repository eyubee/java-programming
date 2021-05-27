package day06_arithetic_operators;

public class CarDriverInfo {
    public static void main(String[]args)
    {
        String carModel="Lexus SE";
        String driverName= "Eyerusalem Tefera";
        String licenseNum= "Abe1223";
        short speed= 120;
        boolean isAutomatic =true;
        boolean isIttrue= false;
        char licensClass ='C';
        char gender='F';
        System.out.println("Car model is "+carModel+"\nDiver name is "+driverName+"" +
                "\nlicense number is: " +licenseNum+"\nDriving Speed: "+speed+"\nIs the car automatic? "+
                isAutomatic+"\nwhat class was the licens? "+licensClass+"\nwhat was the gender of the driver? "+gender );
             //write a code donald trump is driving the car
        System.out.println(driverName+" is driving"+carModel);
        //curren spped is : mph
        System.out.println("Current speed is: "+speed+"mph");

        // you can't do boolean and char concat  but you can brake into two prints or add string in between
        //ex: System.out.print(gender+isIttrue); System.out.println(gender+seed);


    }
}
