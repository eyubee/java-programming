package day41_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayAsList {
    public static void main(String[] args) {
        List  <Integer> nums = Arrays.asList(23, 1,34,54, 654);
        System.out.println("nums = "+nums);
/**      nums.add(100);
        nums.remove(0);    those can't be used becuase the list is unchangeable */
List<Integer> newList= new ArrayList<>(Arrays.asList(4,5,20, 100,400));
        newList.add(55);
        newList.add(200);
        System.out.println("num list = "+newList);
        newList.remove(0);
        newList.remove(new Integer(10));
        System.out.println("after removal "+newList);

        /**List String drinkWithCoffee */

        List<String > drinkWithCoffee= new ArrayList<>(Arrays.asList("coffee", "tea","monster", "red bull", "coke", " pepsi"));
        int coffeeineAmount=0;
        for(String eachDrink:drinkWithCoffee ){
            if(eachDrink.equals("monster") ||eachDrink.equals("red bull") || eachDrink.equals("tea")){
                coffeeineAmount=150;
                System.out.println(eachDrink+" "+ coffeeineAmount);
            }
        }
for (String drink: drinkWithCoffee){
    switch (drink){
        case "monster": case "red bull": case "tea":
            coffeeineAmount=150;
            System.out.println(drink+" "+ coffeeineAmount);
            break;
        case "coffee": case"kambucha":
            coffeeineAmount= 122;
            System.out.println(drink+" "+ coffeeineAmount);
            break;
    }
}
        drinkWithCoffee.forEach(drink  -> System.out.println(drink));
        drinkWithCoffee.forEach(drink  -> System.out.println(drink.toUpperCase()));

        drinkWithCoffee.forEach(drink-> {
            System.out.println("this is for each block");
        });
    }
}
