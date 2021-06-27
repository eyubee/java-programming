package day55_abstraction.interface_demo;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Firefox webdriver "+ url);

    }

    @Override
    public void findElement(String locator) {
        System.out.println("firefox locator "+locator);

    }

    @Override
    public void quit() {
        System.out.println("quitting firefox ");

    }

    @Override
    public String getTitle() {
        return "firfox title ";
    }
}
