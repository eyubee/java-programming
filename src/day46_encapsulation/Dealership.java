package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1= new Car();
//        car1.model= "Nissan Altima";
     //   car1.getModel("nissan");
        car1.setModel("Nissan");
        System.out.println("car model = "+ car1.getModel());
        car1.setYear(2021);
        System.out.println("car1 year = " + car1.getYear());
        car1.setMileage(12);
        System.out.println("car1 mileage = " + car1.getMileage());
        System.out.println(car1.toString());
        System.out.println(car1);
    }
}
