package day37_methods_overloading;

public class DyaSelector {
    public static void main(String[] args) {
        System.out.println(getDayName(8));
        //looping from 1 to 8 and call the getDayNmae with loop
        for (int i=1; i<=8; i++){
            System.out.println(i+"="+getDayName(i));
            //store getDayName into variable and prinf variable
            String name= getDayName(2);
            System.out.println(name);
            System.out.println(getDayNameV2(3));

        }

    }
    public static String getDayName(int day) {
        switch (day) {
            case 1: return "monday";
            case 2: return "tuesday";
            case 3: return "wednesday";
            case 4: return "thursday";
            case 5: return "friday";
            case 6: return "saturday";
            case 7: return "sunday";
            default: return "invalid day";



        }

    }
    /**                    BEST PRACTICE   */
    public static String getDayNameV2(int day) {
        String dayName;
        switch (day){
            case 1:dayName="monday";
            break;
            case 2:dayName="tuesday";
            break;
            case 3:dayName="wednesday";
            break;
            case 4:dayName="thursday";
                break;
            case 5:dayName="friday";
                break;
            case 6:dayName="sarurday";
                break;
            case 7:dayName="sunday";
                break;
            default:
                System.out.println("invalid day"+day);
               dayName=null;
        }
        return dayName;

    }
}
