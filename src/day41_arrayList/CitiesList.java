package day41_arrayList;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        /**declare arrayList */
        ArrayList <String> cities= new ArrayList<>();
        /** adding cities to arraylist  ADD METHODS */
         cities.add("NY");//index 0
        cities.add("atl");//1
        cities.add("addis");//2
        cities.add("LA");//3
        /** another way to add is using index*/
        cities.add(0,"atl");
        /**print all the arraylist values*/
        System.out.println(cities);
        /** print first and last city*/
        System.out.println("first cities= " + cities.get(0));
        System.out.println("last cities= " + cities.get(4));
        /**can also use size() -1*/
        System.out.println("last city = "+ cities.get(cities.size()-1));
        /**PRINT COUNT OF ITEMS IN ARRAY LIST */
        System.out.println("count of items in the list "+ cities.size());
        /** use for loop and print all values in the same line */
        for(int i=0; i<cities.size();i++){
            System.out.print(cities.get(i)+" ");


        }
        System.out.println();
        /**print cities using for each loop*/
        for (String each: cities){
            System.out.print(each+" ");
        }
        System.out.println();
        //delete item from arraylist
        //remove using index
        cities.remove(3);// delete value at index 3
        //remove using object/value
         cities.remove("NY");
        System.out.println(cities);

        //remove all cities from arraylist
        /** to check if empty*/
        cities.clear();
        System.out.println(cities);
        System.out.println(cities.isEmpty());
        //can also check size()
        if(cities.size()==0){
            System.out.println("is empty");
        }






    }
}
