package day43_List_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main (String [] args){
        System.out.println(getDays());
        List<String > daysNames= getDays();//storing it into another variable

        /** Remove all days that have 6 charaters*/
        daysNames.add("java day");
        daysNames.removeIf( day -> day.length() ==6 );

        System.out.println("daysNmaes after removeIF= "+daysNames);
        System.out.println(getRandomeList(4));
        List<Integer> nums= getRandomeList(100);
        System.out.println("num size = "+nums.size());
        /**Remove all recs under 90 */
        nums.removeIf( newnums ->newnums<90);
        System.out.println(nums);

    }
    public static List<String> getDays(){
        /**List<String> daysList= new ArrayList<>();
        LONG WAY TO ADD
        daysList.add("monday"); daysList.add("tuesday"); daysList.add("wednesday"); daysList.add("thursday");daysList.add("friday");daysList.add("saturday"); daysList.add("sunday");*/
        List<String> daysList= new ArrayList<>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

      return  daysList;
    }
    /**getRandomeList
     * parm: in size
     * return List<Integer>
     *genarate randome #s (0-100)     */
    public static List<Integer> getRandomeList(int size){
        Random nums= new Random();
        List<Integer> list= new ArrayList<>();

        for(int i=0; i<= size; i++){
            list.add(nums.nextInt(101));

        }
     return list;
    }

}
