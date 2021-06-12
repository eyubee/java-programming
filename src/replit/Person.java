package replit;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return firstName+ " | "+ lastName+ " | "+age;
    }
    public String getFirstName(){
        return firstName;

    }
public void setFirstName(String firstName){
        this.firstName= firstName;
}

public String getLastName(){
        return lastName;
}
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age= age;
    }
    public int getAge(){
        return age;
    }
    public  Person(){
        this.lastName= "undefined";
        this.firstName="undefined";
        this.age = -1;

    }
    public Person(String firstName, String lastName, int age){
        this.firstName= firstName;
        this.lastName=lastName;
        this.age=age;
    }


}

