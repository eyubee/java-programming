package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle= "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length()==0);
        System.out.println(jobTitle.equals(""));//returns true/false
        String space =" ";
        System.out.println(space.isEmpty());
        if (!jobTitle.isEmpty()){
            System.out.println("job titile isn't emptry");
        }else{
            System.out.println("is empty");
        }
    }
}
