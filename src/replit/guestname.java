package replit;
import java.util.*;

public class guestname {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String addGuest="";
        String totalguest="";
        do{
            System.out.println("Please enter guest name:");
            String name=input.next();
            System.out.println("Do you want to enter new guest name:");
            addGuest=input.next();

            totalguest+=name+", ";
        } while (addGuest.equalsIgnoreCase("yes"));

        System.out.println("Guest's list: "+totalguest.substring(0,totalguest.lastIndexOf(",")) );


        }


    }
