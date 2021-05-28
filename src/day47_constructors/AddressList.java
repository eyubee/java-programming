package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address myAddress= new Address();//calling consitactor
        myAddress.setStreet("4000 Hancock cir");
        myAddress.setCity("Atlanta");
        myAddress.setState("GA");
        myAddress.setZipCode(3001);
        System.out.println("my street address is  = " + myAddress.toString());

        Address newAddress= new Address();
       // System.out.println("newAddress constructor = " + newAddress.toString());
        newAddress.setStreet("400 main street");
        newAddress.setCity("Atlanta");
        newAddress.setState("Ga");
        newAddress.setZipCode(344230);
        System.out.println(newAddress.toString());

        Address address2= new Address("123 hahah", "atlanat", "ga",30021,"USA");
        System.out.println("Address 2= "+address2);
    }
}
