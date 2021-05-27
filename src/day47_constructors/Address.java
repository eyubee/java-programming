package day47_constructors;

public class Address {
   private String street;
   private String city;
   private String state;
   private int zipCode;
   private String country="USA";

   public void setStreet(){
       this.street.equals(street);
   }

   public String getStreet(){
       return street;
   }
    public void setCity(){
        this.city.equals(city);
    }

    public String getCity(){
        return city;
    }

    public void setState(){
        this.state.equals(state);
    }

    public String getState(){
        return state;
    }

    public void setZipCode(){
        this.zipCode= zipCode;
    }

    public int getZipCode(){
        return zipCode;
    }
    public String getCountry(){
       return country;
    }


    public String toString() {
        return state+", "+ city+ ", "+ state+ " "+zipCode;
    }
}
