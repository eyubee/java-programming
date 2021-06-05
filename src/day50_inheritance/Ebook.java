package day50_inheritance;

public class Ebook extends Book {
    int size;
    int pages;
    public void readBook(){
        System.out.println("i have the "+title+" in ebook");
        System.out.println("the size of the book i have is "+ size);
        System.out.println("i read "+pages+" pages of "+title);
    }
}
