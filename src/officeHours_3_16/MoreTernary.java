package officeHours_3_16;

public class MoreTernary {
    public static void main(String[] args) {
        int houtlyRate =65;
        String reply= houtlyRate> 50? "accept":"reject";
        System.out.println("Reply = "+reply);
        String todaysClass= "java";
        String teacher=todaysClass.equals("java")?" Saim or murodil":" nadir ";
        System.out.println("teacher = " + teacher);
        boolean isEligableToDrive =true;
        String driving= isEligableToDrive? "have DL, can drive": "no DL, can't drive";
        System.out.println("driving = " + driving);
    }
}
