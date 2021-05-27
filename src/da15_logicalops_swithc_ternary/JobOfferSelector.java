package da15_logicalops_swithc_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        //location, salary, isRemote, benefit
        String location= "Atlanta";
        double salary = 120000;
        boolean isRemote = true;
        boolean benefits= true;
        if (location.equals("Atlanta") && salary >=120000 && isRemote && benefits){
            System.out.println("Great job offer consider taking it");
        }else{
            System.out.println("Keep looking");
        }
    }
}
