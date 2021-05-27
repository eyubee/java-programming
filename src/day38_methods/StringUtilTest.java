package day38_methods;
import static day38_methods.StringsUtiles.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName="";
        if (StringsUtiles.isNullOrEmpty(userName)){
            System.out.println("fail: username can't be null or empty");
        }
        System.out.println(StringsUtiles.IsPalidrom("civic"));
        System.out.println(IsPalidrom("banana"));
        System.out.println(reverse("java"));


    }

}
