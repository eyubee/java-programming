package day16_switch_ternary;

public class Apartments_info {
    public static void main(String[] args) {
        int numberOfBedroom = 0;
        double staringPrice = 0;
        //when number of # is 0

        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        numberOfBedroom = 2;
        switch (numberOfBedroom) {
            case 1:
                staringPrice = 1454;
                System.out.println("Studio apartment selected ");
                break;
            case 2:
                staringPrice = 1725;
                System.out.println("One apartment selected ");
                break;
            case 3:
                staringPrice = 2899;
                System.out.println("Two apartment selected ");
                break;
            default:
                System.out.println("5 bedrrom surrentlly not abailable");
                break;
        }
        System.out.println("starting price is $" + staringPrice);


    }
}
