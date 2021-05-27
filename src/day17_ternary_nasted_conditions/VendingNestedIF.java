package day17_ternary_nasted_conditions;

public class VendingNestedIF {
    public static void main(String[] args) {
        String selection= "drink";
        String drink ="Tea";
        String snack= "chips";
        if(selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drink.equals("tea")) {
                System.out.println("tea selected");
            } else {
                System.out.println("cook selected");
            }

        }else if  (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snack.equals("chips"))
            { System.out.println("chips selected");
            }else {
                System.out.println("candy selected");
            }
        }
    }
}
