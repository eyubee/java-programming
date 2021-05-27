package day13_conditional_statements;

import java.sql.SQLOutput;

public class IfWithBooleanVariable {
    public static void main(String[]args){
    boolean isHungry= false;

    //if (isHungry==true) since this is boolean, you can just put the data without equstion  or == and so on

            if(isHungry){
        System.out.println("Time to eat");
    }
    else {
        System.out.println("keep working");
    }
    double price =500.44;
    // boolean isAffordable =200;this doesn't work becuse it isn't comparing anything
        boolean isAffordable=price <=200;
            if (isAffordable ){
                System.out.println("You can afford to buy it");
            }
            else{
                System.out.println("you can't affor it");
            }
            boolean isRemoteJob= false;
            //if not remote job print"not intersted otherwise print sure, i am intersted. what is the interview process?
            //if (isRemoteJob!= true){ this is the long way
            if(!isRemoteJob){
                System.out.println("Sorry not intersted ");
            }
            else{
                System.out.println("I am intersted, what does the intterview process look like?");
            }
}
}
