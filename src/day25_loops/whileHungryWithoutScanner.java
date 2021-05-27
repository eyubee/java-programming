package day25_loops;


public class whileHungryWithoutScanner {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        // while(isHungry ){
        // bananas++;
        //System.out.println("ate banana count = "+bananas);
        //if (bananas==countToFull){
        //  isHungry =false;
        //   }
        // }
        //  System.out.println("eat enough bananas, lets get back to work");

        while (isHungry = true && bananas < countToFull) {
            bananas++;
            System.out.println("ate banana count = " + bananas);
        }
        System.out.println("eat enough bananas, lets get back to work");
        int years = 1;
        int grows = 0;
        int size = 0;
        for (int i = 1; i <= 10; i++) {
            grows += 1;
            size = grows;
            System.out.println("year " + years + " - growth " + grows + " cm\ntree size: " + size + "cm");


        }
    }
        }

