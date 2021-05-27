package day18_conditions_strings_intro;

public class CarLeasinTest {
    public static void main(String[] args) {
       ///Make => Mercedes
        //    Model =>  E
        //        leasePrice = 500
        //    Model => A
        //        leasePrice = 400


        String maker = "mercedes";
        char model = 'E';
        int leasePrice= 400;
        //if (model=='e' || model=='E' && maker.equals("mercedes")) leasePrice= 500;
         //   System.out.println(maker+ " "+model+" leasig price "+leasePrice );
           // if (model=='a' || model=='A' && maker.equals("mercedes")) {leasePrice = 400;
        //System.out.println(maker + " " + model + " leasig price " + leasePrice);} old meathod

        if (maker.equals("mercedes") || maker.equals("Mercedes"))
        {
            if (model=='E' || model=='e'){
                leasePrice= 500;
                System.out.println(maker+ " "+model+" leasig price "+leasePrice );
            } else if ( model== 'a' || model== 'A'){
                leasePrice= 400;
                System.out.println(maker+ " "+model+" leasig price "+leasePrice );
            }
        } else {
            System.out.println("invalid input");
        }
        //Make => Audi
        //    Model =>  SQ5
        //        leasePrice = 552
        //    Model => A3
        //        leasePrice = 412
        if (maker.equals("Audi") || maker.equals("audi")){
            if (model == 'S' || model == 's'){
                leasePrice= 552;
                System.out.println(maker+ " "+model+" leasig price "+leasePrice );
            } else if (model == 'a' || model == 'A'){
                System.out.println(maker+ " "+model+" leasig price "+leasePrice );
            }else {
                System.out.println("invalid input");

            }
        }


    }
}
