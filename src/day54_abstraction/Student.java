package day54_abstraction;

public abstract class Student {
    public void code(String language) {
        System.out.println("student is coding using " + language);
    }

   public abstract void attendClass();
}

