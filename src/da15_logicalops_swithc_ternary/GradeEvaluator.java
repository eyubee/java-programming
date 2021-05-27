package da15_logicalops_swithc_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        //grade= a, b, c,d , e

        char grade = 'D';
        if (grade == 'A') {
            System.out.println("passsed with grade " + grade);
        } else if (grade == 'B') {
            System.out.println("passsed with grade " + grade);
        } else if (grade == 'C') {
            System.out.println("passsed with grade " + grade);
        } else if (grade == 'D') {
            System.out.println("qualify for retake when grade is  " + grade);
        } else {
            System.out.println("invalid grade");
        }
        //OR
        if (grade == 'A' || grade== 'B' || grade=='C'  ) {
            System.out.println("passsed with grade " + grade);
        } else if (grade == 'D') {
        System.out.println("qualify for retake when grade is  " + grade);
        }else {
            System.out.println("invalid grade");
        }
    }
}
