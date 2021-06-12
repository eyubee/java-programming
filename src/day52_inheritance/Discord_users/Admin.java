package day52_inheritance.Discord_users;

public class Admin extends User{
    public Admin(){
        super();//call supper class which is user no-args constructor
        System.out.println("Admin no args constructor");
    }
    public Admin(String role,String name, int id){
        super(role,name, id);
        System.out.println("admin class 2 args constructor");
    }

@Override
    public String toString(){
        return "Admin{ "+
                "name ="+ getName()+ '\''+
       "role = "+getRole()+ '\''+
     "id = "+ getId()+"}";

}
}
