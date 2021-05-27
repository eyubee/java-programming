package day45_oop;

public class Coffee {
    /** can be 0-100 % */
   int amount;
   /**can be cappuccino,latte and so on  */
   String type;

//    @Override
//    public String toString() {
//        return "Coffee{" +
//                "amount=" + amount +
//                ", type='" + type + '\'' +
//                '}';
//    }

    public void refill(){
       amount=100;
   }
    public void drink( int someAnmout){
       if (someAnmout < amount){
           amount -=someAnmout;
       }
    }
    public int  getAmount (){
       return amount;
    }
    public void setType(String newType){
       type= newType;
    }
    public String getType (){


       return type;
    }
}

