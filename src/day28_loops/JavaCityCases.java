package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases=0;
       // loop day =1 till 30  everyday there are 200 new cases
        //every sunday %7 ==0 there are 500 new cases
        for (int day =1; day <=30; day ++){
            if (day% 7==0){
                totalCases+=500;
            }else {
                totalCases+=200;
            }
            System.out.println("day "+ day+" total cases: "+totalCases);

        }
        System.out.println("javacity 11/21 total cases " + +totalCases);
    }
}
