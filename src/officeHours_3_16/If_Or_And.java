package officeHours_3_16;

public class If_Or_And {
    public static void main(String[] args){
    //Campus is open from 8 am(8) to 11 pm (23)
    // If user enters a time within the open time they should see message : “open” but if the time entered is outside of operating hours they should see: “ closed”
    // If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”
    int time =12;
    if (time <0 || time >24){
        System.out.println("invalid time");
    }else if (time >= 8 && time <=23){
        System.out.println("Campus is open");
    } else {
        System.out.println("campus is close");
    }
}
}