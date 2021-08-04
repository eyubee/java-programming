package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String > books= new Stack<>();
        //LIFO
        books.add("Harry Potter");
        books.add("Leaders eat last");
        books.add("Java 101");
        System.out.println(books);
        books.pop(); //removes and returns the top of the stack item
        System.out.println(books);
        books.push("cucumber");//adding cucumber as last element
        System.out.println(books);


    }
}
