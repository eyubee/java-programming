package day61_exceptions_collections;

public class ElementaryStudents {
    private  String name;
    private int age;
    public ElementaryStudents(){

    }

    public ElementaryStudents(String name, int age) {
        setName(name);
        setAge(age);

    }

    @Override
    public String toString() {
        return "ElementaryStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name== null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age < 5 || age > 12){
            throw new IllegalArgumentException("age cannot be less than 5 or more than 12");
        }
        this.age = age;
    }




}
