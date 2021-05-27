package day24_loops;

public class WhileLoopReverced {
    public static void main(String[] args) {
        int count =5;
        while (count>=0){
            System.out.println("count = "+count);
            count--;
        }
        System.out.println("finished counting ");
        int unreadSMS =10;
       while  (unreadSMS > 0)
    {
            System.out.println("Reading SMS \uD83D\uDC8C"+unreadSMS);
            unreadSMS--;
        }
        System.out.println("no more new SMS");
    }
}
