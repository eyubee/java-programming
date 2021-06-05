package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book =new Book();
        book.title= "java 101";
        book.author= "eyerus amde";
        book.type= "programming";
        book.price= 120;
        book.bookInfo();
        Ebook ebook= new Ebook();
        ebook.pages= 10;
        ebook.size= 35;
        ebook.title= "the way to greatness";
        ebook.readBook();
        AudioBook audioBook= new AudioBook();
        audioBook.title= "my dream house";
        audioBook.narrator=" james bob";
        audioBook.length= 120;
        audioBook.listen();
    }
}
