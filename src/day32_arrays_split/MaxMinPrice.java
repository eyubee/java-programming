package day32_arrays_split;
import java.util.Arrays;
public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        //print array values as String , in the same line without loop
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        //find and print details of most expensive item and least expensive item
        int indexOfMaxPrice =0;//assume first price is max
        double maxPrices=prices[0];//assume max prices is at index 1
        for (int i= 0; i< prices.length; i++){
            if (prices[i] >maxPrices){
        maxPrices= prices[i];
        indexOfMaxPrice=i;
            }
        }
        System.out.println("maxPrice= "+maxPrices+"\nindexOfMaxPrice = "+indexOfMaxPrice+"- #"+itemIDs[indexOfMaxPrice]);
    }
}
