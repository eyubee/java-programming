package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message ="Sender: [Nadir] from number<22222222> Message: {hello my name is}";
        String Sender="";
        String  txt="";
        String phonenumber="";
        Sender= (""+message.substring(message.indexOf("[")+1,message.indexOf("]")));
        System.out.println("Sender: " +Sender);
       txt= (""+message.substring(message.indexOf("<")+1,message.indexOf(">")));
        System.out.println("Phone number " +txt);
        phonenumber= (""+message.substring(message.indexOf("{")+1,message.indexOf("}")));
        System.out.println("Message: " +phonenumber);

    }
}
