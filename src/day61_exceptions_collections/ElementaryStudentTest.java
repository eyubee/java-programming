package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {

        try {
            ElementaryStudents elementaryStudents= new ElementaryStudents();
            elementaryStudents.setName("bob");
            elementaryStudents.setAge(1);
            System.out.println(elementaryStudents.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---execution completed----");
    }
}
