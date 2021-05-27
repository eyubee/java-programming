package dat22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String  technologies="java, html, css, selenium, testing, maven, cucumber";
        //find the first comma
        System.out.println(technologies.indexOf(","));
        //last comma
        System.out.println(technologies.lastIndexOf(","));
        //find middle comma
        int indexOfJava=technologies.indexOf("java" );
        System.out.println("java is at index: "+indexOfJava);
        int idxOfCss= technologies.indexOf("css");
        System.out.println("css index: "+idxOfCss);
        int idxOfSelenium= technologies.indexOf("selenium");
        System.out.println("inx of selenium: "+idxOfSelenium);
        int indexOfSQL=technologies.indexOf("SQL");
        System.out.println("inx of SQL: "+indexOfSQL);
    }
}
