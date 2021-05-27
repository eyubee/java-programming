package day43_List_custom_classes;

public class Employee {
    //instance or object variables
    String name;
    String jobTtile;
    public void work(){
        System.out.println(name +" works as "+jobTtile);
    }

}
class employeeInfo{
    public static void main (String [] args){
        Employee employee1= new Employee();
        employee1.name="bob smith";
        employee1.jobTtile= "CEO";
        employee1.work();
}


}
