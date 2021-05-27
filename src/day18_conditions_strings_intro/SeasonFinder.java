package day18_conditions_strings_intro;

public class SeasonFinder {
    public static void main(String[] args) {
        int month =10;
        //1winter 2, 1, 2
        // Spring 3, 4, 5
        //summer 6,7, 8
        // Fall 9, 10, 11
        switch (month){
            case 12: case 1: case 2:
                System.out.println("winter time ");
            break;
            case 3: case 4: case 5:
                System.out.println("spring time");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer time ");
                break;
            case 9: case 10: case 11:
                System.out.println("fall time ");
                break;

        }
    }
}
