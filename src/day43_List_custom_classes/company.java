package day43_List_custom_classes;

public class company {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        Employee employee2= new Employee();
        Employee payer= new Employee();
        employee1.name="bob";
        employee1.jobTtile= "CEO";
        employee1.work();
        employee2.name="james";
        employee2.jobTtile= "CFO";
        employee1.work();
        payer.name="Eyu";
        payer.jobTtile= "stakeholder";
        payer.work();

    }
}
