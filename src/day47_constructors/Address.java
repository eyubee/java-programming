package day47_constructors;

public class Address {
   private String street;
   private String city;
   private String state;
   private int zipCode;
   private String country="USA";
   //below is the constructor
   public Address (){
       System.out.println("address constructor");
   }
   public Address (String street, String city, String state, int zipCode,String country ){
       this.street= street;
       this.city= city;
       this.state= state;
       this.zipCode= zipCode;
       this.country= country;


   }

   public void setStreet(String street){

       this.street=street;
   }

   public String getStreet(){

       return street;
   }
    public void setCity(String city){
        this.city=city;
    }

    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state= state;
    }

    public String getState(){
        return state;
    }

    public void setZipCode(int zipCode){
        this.zipCode= zipCode;
    }

    public int getZipCode(){
        return zipCode;
    }
    public String getCountry(){
       return country;
    }


    public String toString() {
        return street+", "+ city+ ", "+ state+ " "+zipCode;
    }
}
