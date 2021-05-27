package dat19_class_vs_object_string;

public class StringStartsEndWith {
    public static void main(String[] args) {
        String word= "intellij idea";
        System.out.println(word.startsWith("i"));//true
        System.out.println(word.endsWith("j"));//false
        System.out.println("java".startsWith("J"));//both methods are case sensative
        System.out.println("java".endsWith("k"));
        String name="Ms tefera";
        if (name.startsWith("Ms")){
            System.out.println(name+" is single women");
        }else if( name.startsWith("MR.")){
            System.out.println(name+ "is man");
        }else if (name.startsWith("Mrs")){
            System.out.println(name+ " married women " );
        }else if (name.startsWith("Sr")){
            System.out.println(name+" senior");
        }
        String webStite ="eyu.com";
        if (webStite.endsWith(".com")){
            System.out.println(webStite+" site  is commercial");
        }else if (webStite.endsWith(".gov")){
            System.out.println(webStite+" site  is governement ");
        }else if (webStite.endsWith(".ru")){
            System.out.println(webStite+" site  is Russian");  }
        else if (webStite.endsWith(".edu")){
            System.out.println(webStite+" site  is education ");
        }else if (webStite.endsWith(".org")){
            System.out.println(webStite+" site  is organization ");
        }
    }
}
