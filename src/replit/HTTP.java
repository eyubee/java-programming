package replit;
import java.util.Scanner;
public class HTTP {
    public static void main(String[] args) {
        //Do Not Change
        System.out.println("Enter status code:");
        Scanner scan = new Scanner(System.in);
        int status = scan.nextInt();

        //WRITE YOUR CODE HERE:
        switch (status) {
            case 200 :
                status=200;
                System.out.println("OK");
            break;
            case 201 :
                status=201;
                System.out.println("Created");
                break;
            case 202 :
                status=202;
                System.out.println("Accepted");
                break;
            case 301 :
                status=301;
                System.out.println("Moved Permanently");
                break;
            case 303 :
                status=303;
                System.out.println("See Other");
                break;
            case 304 :
                status=304;
                System.out.println("Not Modified");
                break;
            case 307 :
                status=307;
                System.out.println("Temporary Redirect");
                break;
            case 400 :
                status=400;
                System.out.println("Bad Request");
                break;
            case 401 :
                status=401;
                System.out.println("Unauthorized");
                break;
            case 403 :
                status=403;
                System.out.println("Forbidden");
                break;
            case 404 :
                status=404;
                System.out.println("Not Found");
                break;
            case 410 :
                status=410;
                System.out.println("Gone");
                break;
            case 500 :
                status=500;
                System.out.println("Internal Server Error");
                break;
            case 503 :
                status=503;
                System.out.println("Service Unavailable");
                break;
            default: System.out.println("Invalid status code!");
        }
    }
}