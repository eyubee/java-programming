package day53_inhertiance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        EletricCar eletricCar1= new EletricCar("tesla", "Modle Y",48190.0, 2021, 326 );
        eletricCar1.drive(50);
        System.out.println(eletricCar1.toString());
        System.out.printf("eletricCar1 Maker = "+ eletricCar1.getMake() );
        System.out.println("eletricCar1 Modle = " + eletricCar1.getModel());
        System.out.println("eletricCar1 Price = " + eletricCar1.getPrice());
        System.out.println("eletricCar1 Year = " + eletricCar1.getYear());
        System.out.println("eletricCar1 Range = " + eletricCar1.getRange());
        if (eletricCar1.getPrice()>100000){
            System.out.println(eletricCar1.getModel()+" is out of budget");
        }else{
            System.out.println("can buy this car");
        }
       System.out.println(EletricCar.getCount());
        EletricCar eletricCar2= new EletricCar("Tesla", "cyberTruck", 59900, 2022, 300);
        System.out.println(eletricCar2.toString());
        System.out.println("count = " + eletricCar2.getCount());
        RoadSter roadSter= new RoadSter("","Roadster", 20000.0, 2022,620);
        roadSter.drive(1000);
        roadSter.drive(500);
        System.out.println("count = " + roadSter.getCount());
        ModelX modelX = new ModelX("tesla","ModelX",89990.0,2021,360);
        System.out.println(modelX.toString());
        modelX.drive(10);
        System.out.println("having lunch....");
        modelX.drive(10);
        System.out.println("rang remaning = "+ modelX.getRange());
        System.out.println("count = " + modelX.getCount());


    }


}
