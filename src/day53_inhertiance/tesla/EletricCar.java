package day53_inhertiance.tesla;

public class EletricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private static int count;
    public static final int MAX_RANGE = 400;
    public final void charge(){
        System.out.println("changing electric car using plugin ");
        this.range=MAX_RANGE;
    }

    public static int getCount(){
return count;
    }
    public EletricCar(String make, String model, double price, int year, int range) {
        setMake(make);//this is useful when we have a condition assocated with that variable
        this.model= model;
       this.price= price;
        this.year = year;
        this.range = range;
        count++;

    }
public void setMaker(String make){
    if (make.isEmpty()) {
        System.out.println("ERROR: Make cannot be blank");
    } else {
        this.make = make;
    }

}
    private  int range;

    @Override
    public String toString() {
        return "EletricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    protected void drive(int miles){
        if (range==0 || range - miles < 0){
            System.out.println("Error: can't drive that far, needs to charge");
        }else{
            range -= miles;
            System.out.printf("Driving "+miles+ " miles ");
        }

    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
