package day45_oop;

public class CoffeeObject {
    public static void main(String[] args) {
        Coffee myCoffee= new Coffee();
        System.out.println("coffee amount = "+myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = "+ myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = "+myCoffee.getAmount());

        myCoffee.setType("Ethiopian coffee");
        System.out.println("my new coffee type = "+myCoffee.getType());
        //describe mycoffee= shows all variavle of my coffee
        System.out.println(myCoffee.toString());
        //add another coffee object, set value call method
        Coffee coffee1= new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type  = " + coffee1.getType());
        Coffee coffee2= coffee1;
        System.out.println("coffee2 type =  "+ coffee2.getType());
        coffee2.setType("espresso");
        System.out.println("after changing coffee2 type = "+coffee2.getType());
        System.out.println("after change coffee1 type  = " + coffee1.getType());
        Coffee coffee3= new Coffee();
        coffee3.setType("frappucino");
        coffee3= coffee2;
        System.out.println("coffee3 type = "+ coffee3.getType());
        Coffee coffee4 =    null;
        //coffee4.getType("Ethipian"); nullException

    }
}
