package day41_arrayList;

import java.util.ArrayList;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        ArrayList <String> myCar= new ArrayList<>();
        myCar.add("tesla");
        myCar.add(1,"lexus");
        myCar.add("rangrover");
        myCar.add("jeep");
        myCar.add(0,"ferrari");
        System.out.println(myCar);
        System.out.println(myCar.toString());
        String allCarsInStr= myCar.toString(); //saves all cars in 1 stringg
        System.out.println("all cars in one string"+allCarsInStr);
        /** to replace just one element  */
        myCar.set(4,"lamborghini");
        System.out.println("after set = "+myCar);
        /**how would you change if myCar was array
         * myCar[4] = "honda"*/
       /**INDEX OF METHOD*/
        System.out.println(myCar.indexOf("tesla"));
        /** to store index into a variable*/
        int indexOfElement= myCar.indexOf("tesla");
        System.out.println("what is the stored element "+indexOfElement);
        myCar.set(indexOfElement,"honda");
        System.out.println("after replace "+myCar);

       /** myCar.set(myCar.indexOf("ford"), "rover");
        System.out.println("after set to ford"+myCar);
        get out of bound becuase the result of index of is -1 which set doesn't like */
       if (myCar.contains("ford")){
           myCar.set(myCar.indexOf("ford"), "rover");
       } else{
           System.out.println("ford not found ");
       }
for (int i=0; i< myCar.size(); i++){
    //changing car
    if(myCar.get(i).equals("ferrari")){
        myCar.set(i,"honda");

    }
}
        System.out.println("after removing farari = "+myCar);


    }
}
