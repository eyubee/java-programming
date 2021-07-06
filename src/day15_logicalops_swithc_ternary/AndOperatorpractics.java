package day15_logicalops_swithc_ternary;

public class AndOperatorpractics {
    public static void main(String[] args) {
        //onSale, freeShipping, itemNamw
        String itemNeam = "dress";
        double onSale = 59.99;
        boolean freeShipping = true;
        if (onSale > 50 && freeShipping == true) {
            System.out.println("Dress shipping  is free");
        } else {
            System.out.println("shipping isn't free");
        }
        String itemName2 = "dress";
        boolean freeShipping2 = true;
        boolean onSale2 = true;
        if (freeShipping2 && onSale2) {
            System.out.println("Good deal and free shipping, add to chart");
        } else {
            System.out.println("keep looking for deals");
        }
        if(freeShipping2 &&onSale2&& itemName2.equals("woodenspon")){
            System.out.println("Good deal and free shipping, add to chart");
        }else {
            System.out.println("keep looking for deals");
        }

    }

}
