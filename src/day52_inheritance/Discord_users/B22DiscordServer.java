package day52_inheritance.Discord_users;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1= new User();
        user1.setId(1234);
        user1.setName("bob");
        user1.setRole("student");

        Admin admin1= new Admin();
        admin1.setId(12356);
        admin1.setName("james");
        admin1.setRole("admin");
        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2= new Admin("Admin","robert", 2345);
        System.out.println(admin2);



    }
}
