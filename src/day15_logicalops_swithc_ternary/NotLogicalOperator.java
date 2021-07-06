package day15_logicalops_swithc_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true =" + (!true));
        System.out.println("!false =" + (!false));
        int age = 20;
        if (!(age > 7)) {
            System.out.println("Need to sit in a car seat");
        } else {
            System.out.println("Can sit in the front");
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed)
        {
            System.out.println("Smoking isn't allowed ");
        }
        boolean isAffordable= true;
        if (!isAffordable)// by adding !- the item isn't afforable since it was true on first place the item will false
        {
            System.out.println("item isn't affordable");
        }else {
            System.out.println("item is affordable");}
        String env = "prod";
        if (!env.equals("QA")){
            System.out.println("In wrong environment for QA testing");
        }
        String carModle = "honda";
        //if itsn't tesla, print not intersted
        if (!carModle.equals("tesla")){
            System.out.println("not intersted");}
        String secretPassword ="abc123";
        String inputPassword =" 123abc";
        if (!inputPassword.equals(secretPassword))
        {
            System.out.println("Incorrect password");
        }

    }
}
