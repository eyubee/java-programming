package day55_abstraction.interface_demo;

public class ChromDriver implements  WebDriver{


    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigate to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating to "+ locator);
    }

    @Override
    public void quit() {
        System.out.println("quitting browser ");

    }

    @Override
    public String getTitle() {
        return "chrome title ";
    }
}
