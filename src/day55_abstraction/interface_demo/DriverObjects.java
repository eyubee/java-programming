package day55_abstraction.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        ChromDriver driver1 = new  ChromDriver();
        FireFoxDriver driver2= new FireFoxDriver();
        WebDriver driver = new ChromDriver();
        driver1.get("https://www.google.com");
        driver1.findElement("//input[@name = 'q']");
        System.out.println("titile = "+ driver.getTitle());
    }
}
