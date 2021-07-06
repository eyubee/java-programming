package day59_polymorephism_exceptions;
public class Link implements WebElement {
    public static final String TAG_NAME= "a";

    public void getLinkHref() {
        System.out.println("https://www.java.com");
    }
    @Override
    public void sendKeys(String txt) {
        System.out.println("not supported");
    }

    @Override
    public void click() {
        System.out.println("click here");

    }

    @Override
    public String getText() {
        return "Oracle java";
    }
}
