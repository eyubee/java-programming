package day40_arralist;
import java.util.*;

public class ArrayListmethods {
    public static void main(String[] args) {
        List <String> shoppingList= new ArrayList<>();
        System.out.println("shoppingList size = " + shoppingList.size());
        System.out.println("isEmpty? = "+shoppingList.isEmpty());
        if (shoppingList.isEmpty()){
            System.out.println("shopping list is empty add things");
        }
        shoppingList.add("car");
        shoppingList.add("new house");
        shoppingList.add("mask");
        shoppingList.add("spoon");
        shoppingList.add("bike");
        shoppingList.add("running shoes");
        shoppingList.add("scanner");
        if (shoppingList.isEmpty()){
            System.out.println("shopping list is empty add things");
        } else{
            System.out.println("list isn't empty");
        }

int count=shoppingList.size();
        System.out.println(count);
        System.out.println("is shoes in my list? "+shoppingList.contains("shoes"));
        if(shoppingList.contains("running shoes")){
            System.out.println("you are buying new shoes");
        }
        shoppingList.remove("running shoes");
        System.out.println(shoppingList);
        System.out.println("done shopping, clear the list");
        shoppingList.clear();
        System.out.println(shoppingList);

    }
}
