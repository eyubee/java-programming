package day54_abstraction;

public class OnlineStudent extends Student{
        @Override
          public void attendClass(){
            System.out.println("online student is attending the class using zoom");
        }

}
class CampusStudent extends Student{
    @Override
    public void attendClass(){
        System.out.println("campus student will attend class in person ");
    }

}
class School{
    public static void main(String[] args) {
        OnlineStudent onlineStudent= new OnlineStudent();
        onlineStudent.code("Java");
        onlineStudent.attendClass();

    }

}

