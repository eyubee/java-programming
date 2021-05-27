package day10_shorthand_operator;

public class IncreamentDecrementOperators {
    public static void main(String[]args){
        int i=1;
        System.out.println("i = "+ i);
        ++i;
        System.out.println("i = "+ i);
        i++;
        System.out.println("i = "+ i);
        i=1+1;
        System.out.println("i = "+ i);
        i +=1;
        System.out.println("i = "+ i);
        int linesOfCode =15;
        linesOfCode= linesOfCode+1;
        linesOfCode +=1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("lines of code = "+linesOfCode);
        linesOfCode=linesOfCode-1;
        linesOfCode -=1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("lines of code = "+linesOfCode);
        char letter ='a';
        System.out.println("letter = "+letter);
        ++letter;
        System.out.println("letter = "+letter);
        letter++;
        System.out.println("letter = "+letter);
    }
}
