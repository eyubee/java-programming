package day59_polymorephism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link= new Link();// not polymorphism
        WebElement loginLink = new Link();
        loginLink.click();
        String txt= loginLink.getText();
        System.out.println("txt = "+ txt);
        loginLink.getText();
        loginLink.sendKeys("java");
       // loginLink.getLinkHref(); Error
        WebElement username= new InputField();
        username.sendKeys("wooden spoon");
        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);
        WebElement login= WebElementUtil.getLinkWithText("login");
        login.click();

    }
}
