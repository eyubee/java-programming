package day48_constructors_static;

public class Customer {
    private String name;
    private  int id;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    //no arg constructor
    public Customer(){
        System.out.println("noargs constructor");
        name= "new customer";
        id= 1;

    }
//constructor with part
    public Customer(String name, int id){
        this.name= name;//can also do setName(name);
        this.id= id; //setID(id);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
