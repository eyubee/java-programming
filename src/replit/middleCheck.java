package replit;
import java.util.Scanner;
public class middleCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int charCheck= word.length();
        int checkEvenOdd= word.length()%2;
        int reminder= checkEvenOdd;
        if ((checkEvenOdd==1) && (charCheck==3)){
            System.out.println(""+word.charAt(1));
        }else if ((checkEvenOdd==1) && (charCheck>=3)){
            System.out.println(""+word.charAt(2));}
    else if ((checkEvenOdd==1) && charCheck==1){
        System.out.println(""+word+word+word);
    }else if ((checkEvenOdd==0) && charCheck==4){
        System.out.println(""+word.charAt(1)+word.charAt(1));
    }else if ((checkEvenOdd==0) && charCheck>=4){
        System.out.println(""+word.charAt(1)+word.charAt(2));
    }else if ((checkEvenOdd==0) && charCheck==2){
        System.out.println(""+word+word);}
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;


        sender=message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("Sender: "+sender);
        phoneNumber= message.substring(message.indexOf("[")+1,message.indexOf("]"));
        System.out.println("Phone Number:"+phoneNumber);
        messageBody =message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("message body: "+messageBody);


}
}
