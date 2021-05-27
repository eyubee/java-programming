package day06_arithetic_operators;

public class MoreMathOperators {
    public static void main(String[]args){
        int toyotas= 431;
        int hondas=233;
        int vw=2;
        int tesla=20;
        int nissan =1;
        int bmw=155;
        int totalCarInParking=toyotas+hondas+vw+tesla+nissan+bmw;
        System.out.println("There are "+totalCarInParking +" in the parking lot");
     //how many slice of pizza per a person
        String pizza ="hawaiian";
        int slices=8;
        int peolpe=4;

        int slicesPerPerson= slices/peolpe;
        System.out.println("There are "+slicesPerPerson+" per a person.");

 //we order hawaiian pizza with 8 slices, 4 people ate 2 slices each
        int twoSliceEach=slices/peolpe;
        System.out.println("we order "+pizza+ " pizza with "+ slices+" slices,"+peolpe+" people ate "+twoSliceEach+
                " slices each.");
    }
}
