package day61_exceptions_collections.checked_exceptions;

public class CheckExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");
       /**causes/throws an interrupted
        * checked exception
        * handling issue with try and catch
        */ try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /** handled using throws keyword */
Thread.sleep(5000);
        System.out.println("woke up after 5 seconds");
    }
}
