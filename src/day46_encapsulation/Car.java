package day46_encapsulation;

public class Car {
        //model, year, millage...encapsulated/hidden insurance
    private String model;
    private int year;
    private int mileage;
    //setter method for model
    public  void setModel(String carModdel){
        model= carModdel;
//        carModdel="nissan";
    }
    //getter method for model
    public String getModel(){
        return model;

    }
    //setter for year
    public void setYear(int carYear ){
      year=carYear;
    }
    //getter for year
    public int getYear(){
        return year;
    }
//setter mileage
    public void setMileage(int mileage){
     this.mileage= mileage;
    }

    //getter mileage
    public int getMileage() {

        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }

    //to get mileage to string'
    public void setMilage(int mileage){
        this.mileage=mileage;

    }


}
