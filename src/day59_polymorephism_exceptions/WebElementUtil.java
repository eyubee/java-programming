package day59_polymorephism_exceptions;

public class WebElementUtil {
    /**polymorphism with parameter
     * WebElement element can accept ANY child class object */
    public static void clickElement(WebElement element){
        System.out.println("clicking on element");
        element.click();
    }
    public static WebElement getLinkWithText(String txt){
        System.out.println("searching for a link with txt= "+ txt);
        return new Link();
    }
}
