package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cust1= new Customer();
        System.out.println(cust1);
        cust1.setId(5);
        cust1.setName("bob");
        System.out.println(cust1);
        Customer cust2= new Customer("mike", 2);
        System.out.println(cust2);

        //array of customers
        Customer custList[]= {cust1,cust2,new Customer("jhon", 49)};
        System.out.println(Arrays.toString(custList));
        //arrayList of customer objects

        List<Customer> customerList =new ArrayList<>();
        customerList.add(cust1);
        customerList.add(cust2);
        customerList.add(new Customer("bob",2));
        System.out.println(customerList);
        for (int i=0; i< customerList.size(); i++){
            System.out.println(customerList.get(i));
        }
        System.out.println("-------for each loop-------");
        for (Customer eachCustomer: customerList){
            System.out.print(eachCustomer+" ");
        }
        System.out.println("----names of customers---");
        for (Customer eachCustName: customerList){
                System.out.print(eachCustName.getName()+" ");

        }
        //foreah method with lambda experssion
//        for(Customer each --> customerList){
//
//        }
    }
}
