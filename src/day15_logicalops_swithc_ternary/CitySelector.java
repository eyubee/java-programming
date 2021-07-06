package day15_logicalops_swithc_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city1 = "England";
        String city2 = "NY";
        if (city1.equals("England") || city2.equals("NY")) {
            System.out.println("willing to relocate");
        } else {
            System.out.println("Stay in Atlanta");
        }
        if (city1.equals("England") || city1.equals("Mars")) {
            System.out.println("Will be relcating to " + city1);
        } else {
            System.out.println("not relocating");
        }
        String teacher = "Saim";
        //Saim, Murodil java class if not java class
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("it is java class with " + teacher);
        } else {
            System.out.println("not java class and it is soft skill class");
        }
        //1. teacher is saim or murodil java class
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("it is java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("soft skillclass ");
        } else {
            System.out.println("other class");
        }
        String company ="cisco";
        double salary = 100000;
        if (company.equals("cisco") || salary >=120000){
            System.out.println("accept offer ");
        }else {System.out.println("look for better offier");
        }

    }
}