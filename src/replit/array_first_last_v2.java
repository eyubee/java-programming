package replit;
import java.util.*;

public class array_first_last_v2 { public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below
    String firstLast="";
    int count=0;
    String [] firstLastArray =firstLast.split(" ");

for (String currentWord : words){
    firstLast=""+currentWord.charAt(0)+currentWord.charAt(currentWord.length()-1)+" ";
    //firstLastArray =firstLast;
    System.out.println(firstLast);
}
for (String firsLasteach: firstLastArray){
    if (firsLasteach.length()==2){
        count++;
        System.out.println(count);
}
    }
String [] newWordArray=new String [count];
int x=0;
for (String firsLasteach: firstLastArray){
    if (firsLasteach.length()==2){
        newWordArray[x]=firsLasteach;
        x++;
        System.out.println(Arrays.toString(newWordArray));
    }
    }


    }
}