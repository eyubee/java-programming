package day17_ternary_nasted_conditions;

public class TeslaModel {
    public static void main(String[] args) {
        int price = 130000;
        char model = 'S';
        int range = 412;
        int topSpeed = 155;
        double time = 3.1;
        String trim = "plaid";
        if (model == 'S') {
            System.out.println("selected model is " + model);
            if (trim.equals("long range")) {
                range = 412;
                time = 3.1;
                System.out.println("trim =" + trim);
                System.out.println("This car has speed range of " + range + " miles per " + time + " seconds");
            }
            if (trim.equals("plaid")) {
                range = 390;
                time = 1.99;
                System.out.println("trim = " + trim);
                System.out.println("This car has speed range of " + range + " miles per " + time + " seconds");
            } else if (trim.equals("plaidPluse")) {
                range = 520;
                time = 1.99;
                System.out.println("trim = " + trim);
                System.out.println("This car has speed range of " + range + " miles per " + time + " seconds");
            } else {
                System.out.println("select another model");
            }

        }
    }
}
