package day56_abstraction;

public class DifferentLanguage implements Greeting{
    @Override
    public void hi() {
        System.out.println("hi is selam");
    }

    @Override
    public void bye() {
        System.out.println("bye is chawe");

    }
}
