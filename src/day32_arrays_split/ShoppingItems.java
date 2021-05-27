package day32_arrays_split;
import java.util.Arrays;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        System.out.println("-----find the index of 'gloves' in items array---");
        for(int indexOfGlove=0; indexOfGlove <items.length; indexOfGlove++   ){
            if(items[indexOfGlove].equals("Gloves")){
                System.out.println("gloves index= "+indexOfGlove);
                break;//exit for loop

            }

        }
        System.out.println("---set boolean to true if first 'ipad is found");
        boolean ipadExists =false;
        for (String item: items) {
            if (item.equalsIgnoreCase("ipad")){
                ipadExists=true;
                System.out.println("ipadexists= "+ipadExists);
                break;
            }

        }
        System.out.println("----print a report of each shopping item----");
        /**shoes- 99.99-#12345....iphone 12 case--39.99-#12350
      */
        for (int i= 0; i< items.length;i++){
            if(items[i].equalsIgnoreCase("shoes") || items[i].equalsIgnoreCase("iphone 11 case")
            ){
                System.out.println(items[i]+" -$"+prices[i]+"- #"+itemIDs[i]);
            }

        }
        System.out.println("----loo for 'jacket' in iteams and prit all details ");
        for (int i= 0; i< items.length;i++){
            if(items[i].equalsIgnoreCase("Jacket") )

            {
                System.out.println(items[i]+" -$"+prices[i]+"- #"+itemIDs[i]);
                break;//stop searching after jacket is found
            }

        }
}
}