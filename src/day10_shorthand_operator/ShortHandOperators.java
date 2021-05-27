package day10_shorthand_operator;

public class ShortHandOperators {
    public static void main(String []args){
       int cars =10;
        cars=cars+10;//old way
       System.out.println("cards in the parking log = "+cars);
       cars +=10;
       System.out.println("cards in the parking log = "+cars);
       int eletricCars=13;
       cars +=eletricCars;
        System.out.println("cards in the parking log = "+cars);
        String word="java";//old method
        System.out.println("word = "+word);
        word= word+" programming";//long way
        System.out.println("word = "+word);
        word += " is fun";//works as concate
        System.out.println("word = "+word);
        String selenium= " but selenium is more fun. ";
        System.out.println(word+selenium);
        char letter ='A';
        System.out.println("letter = "+letter);
        letter +=3;
        System.out.println("letter = "+letter);
        letter +=1;
        System.out.println("letter = "+letter);
        double parkingFee= 7.50;
        System.out.println("normal parking fee = "+parkingFee);
        //early bird fee is 50% off
        //wweekend parking is free
        parkingFee /=2;
        System.out.println("early bird parking fee = "+parkingFee);
        parkingFee -=parkingFee;
        System.out.println("weekend parking fee = "+parkingFee);


    }
}
