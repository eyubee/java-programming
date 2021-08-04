package day62_collections;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        List <String>  cities = new ArrayList<>();//polymorphism since list is interface we have to do nee Arraylist not list
        Collection <String > polymorphism= new ArrayList<>();
        cities.add("ATL");//add method is from collection or list interface
        cities.add("NY");
        System.out.println("first city: "+cities.get(0));
        /**allows  have duplicates ana indexing */

    }
}
