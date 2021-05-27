package da15_logicalops_swithc_ternary;

public class CarSelector {
    public static void main(String[] args) {
        double carPrice =20000;
        String carName = "tesla";
        double budget= 17000;
        if (carName.equals("Lexus") || carName.equals("tesla") && carPrice<=budget){
            System.out.println("Consider buying the car");
        }else{
            System.out.println("keep looking");}
    }
}
